package com.iscob.iscob.controllers;

import com.iscob.iscob.dto.PersonDTO;
import com.iscob.iscob.entities.Person;
import com.iscob.iscob.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class Personcontroller {

    @Autowired
    PersonService personService;

    @GetMapping("/person/{id}")
    public ResponseEntity<PersonDTO> getPerson(@PathVariable("id") Long id){
        PersonDTO person = personService.getPerson(id);
        return ResponseEntity.ok().body(person);
    }

    @GetMapping("/list")
    public ResponseEntity<List<PersonDTO>> list(@RequestParam(value = "ward", defaultValue = "0") Long ward){
        List<PersonDTO> personDTOList = new ArrayList<>();
        if(ward == 0 ){
            personDTOList.addAll(personService.listAll());
        }else{
            personDTOList.addAll((personService.listByWard(ward)));
        }
        return ResponseEntity.ok().body(personDTOList);
    }

    @PostMapping
    public ResponseEntity<PersonDTO> create(@RequestBody PersonDTO person){
        PersonDTO createdPerson = personService.createPerson(person);
        return ResponseEntity.ok().body(createdPerson);
    }

    @PutMapping("/person/{id}/update")
    public ResponseEntity<PersonDTO> update(@RequestBody PersonDTO person){
        PersonDTO personDTO = personService.updatePerson(person);
        return ResponseEntity.ok().body(personDTO);
    }

    @DeleteMapping("/person/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        personService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
