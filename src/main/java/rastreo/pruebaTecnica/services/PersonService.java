package rastreo.pruebaTecnica.services;

import java.util.List;

import rastreo.pruebaTecnica.entity.Person;

public interface PersonService {
	
	public List<Person> findAll();
	
	public Person save(Person person);
	
	public Person findById(Long id);
	
	public void delete(Person person);
	
}
