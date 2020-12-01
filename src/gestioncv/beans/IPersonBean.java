package gestioncv.beans;

import java.util.List;

import gestioncv.entities.Person;

public interface IPersonBean {

	Person addPerson(Person person);

	Person updatePerson(Person person);

	List<Person> findAllPerson();

	Person findPerson(long personId);

}
