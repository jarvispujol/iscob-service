package com.iscob.iscob.repositories;

import com.iscob.iscob.entities.Person;
import com.iscob.iscob.entities.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findPersonByWard(Ward ward);
}
