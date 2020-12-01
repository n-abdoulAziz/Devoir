package mayapp1.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mayapp1.entites.CurriculumVitaeCV;

@Stateless(name = "CurriculumVitaCVBean", description = "EJB pour accèder aux  cv")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CurriculumVitaCVBean {
	@PersistenceContext(unitName= "MyDataSource")
	EntityManager em;
	
	public CurriculumVitaeCV findCV(Long n) {
		return em.find(CurriculumVitaeCV.class, n);
	}

	
	public List<CurriculumVitaeCV> findAllCv() {
		// TODO Auto-generated method stub
		 return em.createQuery("Select cv From CurriculumVitae cv", CurriculumVitaeCV.class)
			          .getResultList();
	}
}
