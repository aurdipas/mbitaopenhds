package org.openhds.controller.service.impl;

import java.sql.SQLException;
import java.util.Calendar;
import org.openhds.controller.exception.ConstraintViolations;
import org.openhds.controller.exception.ConstraintViolations;
import org.openhds.controller.service.BaselineService;
import org.openhds.controller.service.EntityService;
import org.openhds.controller.service.MembershipService;
import org.openhds.domain.model.FieldWorker;
import org.openhds.domain.model.Individual;
import org.openhds.domain.model.Location;
import org.openhds.domain.model.Membership;
import org.openhds.domain.model.Relationship;
import org.openhds.domain.model.Residency;
import org.openhds.domain.model.SocialGroup;
import org.openhds.domain.service.SitePropertiesService;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor=Exception.class)
public class BaselineServiceImpl implements BaselineService {

	private MembershipService membershipService;
	private EntityService entityService;
	private SitePropertiesService siteProperties;
	
	public BaselineServiceImpl(MembershipService membershipService, EntityService entityService, SitePropertiesService siteProperties) {
		this.membershipService = membershipService;
		this.entityService = entityService;
		this.siteProperties = siteProperties;
	}

	public void createResidencyAndMembershipForIndividual(Individual individual, Membership membership, Location currentLocation, FieldWorker collectedBy, Calendar startDate) throws SQLException, ConstraintViolations, IllegalArgumentException {
	
		 Residency residency = createResidency(individual, currentLocation, collectedBy, startDate);
	     individual.setInsertDate(Calendar.getInstance());
	     membership.setInsertDate(Calendar.getInstance());
	     individual.getAllResidencies().add(residency);
	     
	     entityService.create(individual);
	     entityService.create(membership);
	     entityService.create(residency);
	}

	private Residency createResidency(Individual individual, Location currentLocation, FieldWorker collectedBy, Calendar startDate) {
		Residency residency = new Residency();
	     residency.setIndividual(individual);
	     residency.setLocation(currentLocation);
	     residency.setStartType(siteProperties.getEnumerationCode());
	     residency.setEndType(siteProperties.getNotApplicableCode());
	     residency.setStartDate(startDate);
	     residency.setCollectedBy(collectedBy);
	     residency.setInsertDate(Calendar.getInstance());
		return residency;
	}
	
	public void createSocialGroupAndResidencyForIndividual(Individual individual, SocialGroup socialGroup, Location currentLocation, FieldWorker collectedBy, Calendar startDate) throws SQLException, ConstraintViolations, IllegalArgumentException {
		
		Residency residency = createResidency(individual, currentLocation, collectedBy, startDate);
	    individual.setInsertDate(Calendar.getInstance());
	    socialGroup.setInsertDate(Calendar.getInstance());
	    individual.getAllResidencies().add(residency);
		
	    entityService.create(individual);
	    entityService.create(socialGroup);
	    entityService.create(residency);
	}
	
	public void createIndividual(Individual individual) throws IllegalArgumentException, ConstraintViolations, SQLException {
		entityService.create(individual);
	}
	
	public void createLocation(Location location) throws IllegalArgumentException, ConstraintViolations, SQLException {
		entityService.create(location);
	}
	
	public void createSocialGroup(SocialGroup group) throws IllegalArgumentException, ConstraintViolations, SQLException {
		entityService.create(group);
	}
		
	public void createResidencyForIndividual(Individual individual, Location currentLocation, FieldWorker collectedBy, Calendar startDate) throws SQLException, ConstraintViolations, IllegalArgumentException {
		Residency residency = createResidency(individual, currentLocation, collectedBy, startDate);		
	
		entityService.create(individual);
		entityService.create(residency);
	}
	
	public void createMembershipForIndividual(Individual individual, Membership membership, SocialGroup socialgroup, FieldWorker collectedBy, Calendar startDate) throws SQLException, ConstraintViolations, IllegalArgumentException {
			
		membership.setIndividual(individual);
		membership.setbIsToA("01");
		membership.setCollectedBy(collectedBy);
		membership.setInsertDate(Calendar.getInstance());
		membership.setSocialGroup(socialgroup);
		membership.setStartDate(startDate);

		entityService.create(membership);
	}

	public void createResidencyMembershipAndRelationshipForIndividual(Individual individual, Membership membership, 
				Relationship relationship, Location currentLocation, FieldWorker collectedBy, Calendar convertedEntryDate)
				throws SQLException, ConstraintViolations, IllegalArgumentException {

		createResidencyAndMembershipForIndividual(individual, membership, currentLocation, collectedBy, convertedEntryDate);
		
		entityService.create(relationship);
	}
}
