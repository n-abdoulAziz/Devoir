package gestioncv.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import javax.inject.Inject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gestioncv.BaseJunit5;
import gestioncv.entities.Person;

public class PersonBeanTest extends BaseJunit5 {

	@Inject
	IPersonBean personBean;

	Person person;
	
	@BeforeEach
	public void setup() {
		person = new Person();
		person.setName("NDIAYE");
		person.setFirstName("Abdoul Aziz");
		person.setEmail("Abdoul-aziz.NDIAYE@etu.univ-amu.fr");
		person.setBirthday(new Date());
		person.setWebsite("www.abdoul-aziz.com");
		person.setPassword("abdoul");
	}

	@Test
	public void testFindPerson() {
		personBean.addPerson(person);
		Person actual = personBean.findPerson(person.getId());
			
		assertEquals(person.getId(), actual.getId());
	}
}