package gestioncv.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import gestioncv.entities.Activity;

@Stateless(name = "CurriculumVitaCVBean", description = "EJB pour accèder aux  cv")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ActivityBean {
	@PersistenceContext(unitName= "MyDataSource")
	EntityManager em;
	
	public Activity findCV(Long n) {
		return em.find(Activity.class, n);
	}

	
	public List<Activity> findAllCv() {
		// TODO Auto-generated method stub
		 return em.createQuery("Select cv From CurriculumVitae cv", Activity.class)
			          .getResultList();
	}
}
