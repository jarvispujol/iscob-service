package com.iscob.iscob.services;

import com.iscob.iscob.dto.PersonDTO;
import com.iscob.iscob.entities.Person;
import com.iscob.iscob.entities.Ward;
import com.iscob.iscob.repositories.PersonRepository;
import com.iscob.iscob.repositories.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private WardRepository wardRepository;

    public PersonDTO getPerson(Long id){
        Optional<Person> optional = personRepository.findById(id);
        Person person = optional.get();
        return new PersonDTO(person);
    }

    public List<PersonDTO> listAll(){
        List<Person> personList = personRepository.findAll();
        return personList.stream().map( p -> new PersonDTO(p)).collect(Collectors.toList());
    }

    public List<PersonDTO> listByWard(Long wardId){
        Ward ward = wardRepository.getOne(wardId);
        List<Person> wardPersonList = personRepository.findPersonByWard(ward);
        return wardPersonList.stream().map( wp -> new PersonDTO(wp)).collect(Collectors.toList());
    }

    @Transactional
    public PersonDTO createPerson(PersonDTO person){
        Person entity = new Person();
        entity.setName(person.getName());
        entity.setGenre(person.getGenre());
        entity.setBirthDate(person.getBirthDate());
        entity.setNewMemberType(person.getNewMemberType());
        Ward ward = wardRepository.getOne(person.getWardID());
        entity.setWard(ward);

        entity = personRepository.save(entity);
        return new PersonDTO(entity);
    }

    @Transactional
    public PersonDTO updatePerson(PersonDTO person){
        Optional<Person> optional = personRepository.findById(person.getId());
        Person entity = optional.get();
        if(person.getName() != null && !person.getName().isEmpty()){
            entity.setName(person.getName());
        }
        if(person.getBirthDate() != null && !person.getBirthDate().equals(entity.getBirthDate())){
            entity.setBirthDate(person.getBirthDate());
        }
        if(person.getGenre() != null && !person.getGenre().equals(entity.getGenre())){
            entity.setGenre(person.getGenre());
        }
        if(person.getNewMemberType() != null && !person.getNewMemberType().equals(entity.getNewMemberType()) ){
            entity.setNewMemberType(person.getNewMemberType());
        }
        if(person.getWardID() != null && person.getWardID() != entity.getId()){
            Ward ward = wardRepository.getOne(person.getWardID());
            entity.setWard(ward);
        }
        entity = personRepository.save(entity);
        return new PersonDTO(entity);
    }

    @Transactional
    public void delete(Long id){
        personRepository.deleteById(id);
    }
}
