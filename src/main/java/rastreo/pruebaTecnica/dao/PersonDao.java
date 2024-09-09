package rastreo.pruebaTecnica.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rastreo.pruebaTecnica.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person , Long> {

}
