package mayapp1.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import mayapp1.entites.Person;

@Stateless(name = "PersonBean", description = "EJB pour accèder aux  persones")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class PersonBean {
		@PersistenceContext(unitName = "MyDataSource")
		private EntityManager em;
		
		public Person findPerson(long personId) {
			return em.find(Person.class, personId);
		}
		
		public List<Person>findAllPerson(){
			return em.createQuery("Select p From Person p", Person.class)
	                .getResultList();
			
		}
	}
