package gestioncv.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import gestioncv.entities.Activity;

@Stateless(name = "ActivityBean", description = "EJB pour accéder aux activités")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ActivityBean implements IActivityBean {
	@PersistenceContext(unitName = "mainDatabase")
	EntityManager em;

	@Override
	public Activity findActivity(Long n) {
		return em.find(Activity.class, n);
	}

	@Override
	public List<Activity> findAllActivities() {	
		return em.createQuery("Select a From Activity a", Activity.class)
				.getResultList();
	}
}
