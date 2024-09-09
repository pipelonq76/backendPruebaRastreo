package rastreo.pruebaTecnica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import rastreo.pruebaTecnica.dao.PersonDao;
import rastreo.pruebaTecnica.entity.Person;

@Service
public class PersonServiceImplement implements PersonService{
	
	@Autowired
	private PersonDao personDao;

	@Override
	@Transactional
	public List<Person> findAll() {
		return (List<Person>) personDao.findAll();
	}

	@Override
	@Transactional
	public Person save(Person person) {
		return personDao.save(person);
	}

	@Override
	@Transactional
	
	public Person findById(Long id) {
		return personDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Person person) {
		personDao.delete(person);
	}

}
