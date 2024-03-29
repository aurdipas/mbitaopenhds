package org.openhds.web.crud.impl;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import org.openhds.controller.service.EntityValidationService;
import org.openhds.controller.exception.ConstraintViolations;
import org.openhds.domain.model.Individual;
import org.openhds.controller.service.IndividualService;
import org.springframework.binding.message.MessageContext;

public class IndividualCrudImpl extends EntityCrudImpl<Individual, String> {

    EntityValidationService<Individual> entityValidator;
 	IndividualService service;
    
    // used for manual conversion between Date and Calendar since the openFaces Calendar doesn't support JSF Converters
    Date dateOfBirth;

    public IndividualCrudImpl(Class<Individual> entityClass) {
        super(entityClass);
    }

    @Override
    public String create() {
        try {
            if (entityValidator.checkConstraints(entityItem) == false) {
                service.evaluateIndividual(entityItem);   
                super.create();
            }
        } catch (ConstraintViolations e) {
            jsfService.addError(e.getMessage());
        }
        return null;
    }
    
    @Override
    public String edit() {
    	String outcome = super.edit();
    	
    	if (outcome != null) {
    		return "pretty:individualEdit";
    	}
    	
    	return null;
    }
        
    public Date getDateOfBirth() {
    	
    	if (entityItem.getDob() == null)
    		return new Date();
    	
    	return entityItem.getDob().getTime();
	}

	public void setDateOfBirth(Date dateOfBirth) throws ParseException {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateOfBirth);
		entityItem.setDob(cal);
	}

    @Override
    public boolean commit(MessageContext messageContext) {
        try {
            service.evaluateIndividual(entityItem);
            return super.commit(messageContext);
        } catch (ConstraintViolations e) {
            webFlowService.createMessage(messageContext, e.getMessage());
        }
        return false;
    }

    public boolean validateIndividual(MessageContext messageContext) {
        try {
            service.evaluateIndividual(entityItem);
        } catch (ConstraintViolations e) {
            webFlowService.createMessage(messageContext, e.getMessage());
            return false;
        }

        return true;
    }

    public boolean prepare(Individual indiv) {
        if (indiv == null) {
            return false;
        }

        entityItem = indiv;
        return true;
    }
    
    public EntityValidationService<Individual> getEntityValidator() {
		return entityValidator;
	}

	public void setEntityValidator(EntityValidationService<Individual> entityValidator) {
		this.entityValidator = entityValidator;
	}

    public IndividualService getService() {
        return service;
    }

    public void setService(IndividualService service) {
        this.service = service;
    }
}
