package gestioncv.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import gestioncv.entities.Person;

@Stateless(name = "PersonBean", description = "EJB pour accéder aux personnes")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class PersonBean implements IPersonBean {
	@PersistenceContext(unitName = "mainDatabase")
	private EntityManager em;

	@Override
	public Person addPerson(Person person) {
		em.persist(person);
	    return person;
	}

	@Override
	public Person updatePerson(Person person) {
	    return em.merge(person);
	}
	
	@Override
	public Person findPerson(long personId) {
		return em.find(Person.class, personId);
	}

	@Override
	public List<Person> findAllPerson() {
		return em.createQuery("Select p From Person p", Person.class)
				.getResultList();
	}
}
