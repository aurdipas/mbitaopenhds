package org.openhds.controller.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openhds.dao.service.GenericDao;
import org.openhds.controller.exception.ConstraintViolations;
import org.openhds.controller.idgeneration.Generator;
import org.openhds.controller.idgeneration.SocialGroupGenerator;
import org.openhds.controller.service.EntityService;
import org.openhds.controller.service.IndividualService;
import org.openhds.controller.service.SocialGroupService;
import org.openhds.domain.model.Individual;
import org.openhds.domain.model.Membership;
import org.openhds.domain.model.SocialGroup;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
public class SocialGroupServiceImpl implements SocialGroupService {

	private EntityService service;
	private GenericDao genericDao;
	private IndividualService individualService;
	private Generator generator;
	
	public SocialGroupServiceImpl(GenericDao genericDao, IndividualService individualService, EntityService service, Generator generator) {
		this.genericDao = genericDao;
		this.individualService = individualService;
		this.service = service;
		this.generator = generator;
	}
	
	public SocialGroup evaluateSocialGroup(SocialGroup entityItem) throws ConstraintViolations {
		
		SocialGroupGenerator sgGen = (SocialGroupGenerator)generator;
	
		if (entityItem.getGroupHead().getExtId() == null) 
			entityItem.setGroupHead(null);
		
	    if (individualService.getLatestEvent(entityItem.getGroupHead()).equals("Death"))
	    	throw new ConstraintViolations("A Social Group cannot be created for an Individual who has a Death event.");	
	        	
    	if (sgGen.generated)	
			return generateId(entityItem);
		
		if (findSocialGroupById(entityItem.getExtId()) != null)
			throw new ConstraintViolations("The Id specified already exists");	
		
		generator.validateIdLength(entityItem.getExtId(), sgGen.getIdScheme());
		
		return entityItem;
	}
	
	public SocialGroup generateId(SocialGroup entityItem) throws ConstraintViolations {
		entityItem.setExtId(generator.generateId(entityItem));
		return entityItem;
	}
	
	public SocialGroup checkSocialGroup(SocialGroup persistedItem, SocialGroup entityItem) throws ConstraintViolations {
		if (!compareDeathInSocialGroup(persistedItem, entityItem))
			throw new ConstraintViolations("A Social Group cannot be saved because an attempt was made to set the Group Head on an Individual who has a Death event.");			
		return entityItem;
	}
		
    /**
     * Retrieves all Social Group extId's that contain the term provided.
     * Used in performing autocomplete.
     */
    public List<String> getSocialGroupExtIds(String term) {
    	List<String> ids = new ArrayList<String>();
    	List<SocialGroup> list = genericDao.findAll(SocialGroup.class, true);
    	Iterator<SocialGroup> itr = list.iterator();
    	while(itr.hasNext()) {
    		SocialGroup item = itr.next();
    		if (item.getExtId().toLowerCase().contains(term.toLowerCase())) 
    			ids.add(item.getExtId());
    	}
    	return ids;
    }
    
	/**
	 * Compares the persisted and (soon to be persisted) SocialGroup items.
	 * If the persisted item and entity item has a mismatch of an end event type
	 * and the persisted item has a end type of death, the edit cannot be saved.
	 */
	public boolean compareDeathInSocialGroup(SocialGroup persistedItem, SocialGroup entityItem) {	
		if (individualService.getLatestEvent(persistedItem.getGroupHead()).equals("Death") ||
				individualService.getLatestEvent(entityItem.getGroupHead()).equals("Death"))		
			return false;

		return true;
	}
	
	@Transactional(rollbackFor=Exception.class)
	public void deleteSocialGroup(SocialGroup group) throws SQLException {
		
		if (group.getMemberships() != null) {
		
			Set<Membership> mems = group.getMemberships();		
			for (Membership item : mems) 
				service.delete(item);
		}
		service.delete(group);
	}
		
	public List<Individual> getAllIndividualsOfSocialGroup(SocialGroup group) {
		
		List<Individual> list = new ArrayList<Individual>();
		List<Membership> mems = genericDao.findListByProperty(Membership.class, "socialGroup", group);
		
		for (Membership item : mems) {
			if (item.getEndDate() == null && !item.isDeleted())
				list.add(item.getIndividual());
		}
		return list;
	}
	
	public List<SocialGroup> getAllSocialGroups(Individual individual) {
		List<SocialGroup> list = genericDao.findListByProperty(SocialGroup.class, "groupHead", individual, true);
		return list;
	}
	
	public SocialGroup getSocialGroupForIndividualByType(Individual individual, String groupType) {
        Set<Membership> memberships = individual.getAllMemberships();
 
        for (Membership membership : memberships) {
            if (membership.getSocialGroup().getGroupType() == null) {
            	return null;
            } else {
                if (membership.getSocialGroup().getGroupType().equals("FAM")) {
                    return membership.getSocialGroup();
                }
            }
        }
        return null;
 	}
		
	@Transactional(rollbackFor=Exception.class)
	public void modifySocialGroupHead(SocialGroup group, Individual selectedSuccessor, 
			List<Membership> memberships) throws ConstraintViolations, SQLException, Exception {

		group.setGroupHead(selectedSuccessor);
		
		// Remove all Memberships from the Social Group	
		Set<Membership> mems = group.getMemberships();  		
		Iterator<Membership> itr = mems.iterator();
		
		while(itr.hasNext()) {
			Membership item = itr.next();
			item.setDeleted(true);
			service.save(item);
		}
		
		// Create new Memberships 
		itr = memberships.iterator();
    	for (Membership item : memberships) 
    		service.create(item);
    	
    	service.save(group);
	}
	
    public SocialGroup findSocialGroupById(String socialGroupId, String msg) throws Exception {
        SocialGroup sg = genericDao.findByProperty(SocialGroup.class, "extId", socialGroupId);
        if (sg == null) {
            throw new Exception(msg);
        }
        return sg;
    }
    
    public SocialGroup findSocialGroupById(String sgExtId) {
        SocialGroup sg = genericDao.findByProperty(SocialGroup.class, "extId", sgExtId);
        return sg;
    }  
}
