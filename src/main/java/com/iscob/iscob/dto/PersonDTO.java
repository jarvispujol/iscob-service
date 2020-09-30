package com.iscob.iscob.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.iscob.iscob.entities.Person;
import com.iscob.iscob.entities.Ward;
import com.iscob.iscob.entities.enums.Genre;
import com.iscob.iscob.entities.enums.NewMemberType;

import java.sql.Date;

public class PersonDTO {

    private Long id;
    @JsonProperty("new_member_type")
    private NewMemberType newMemberType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("genre")
    private Genre genre;
    @JsonProperty("birth_date")
    private Date birthDate;
    @JsonProperty("ward_id")
    private Long wardID;

    public PersonDTO() {
    }

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.newMemberType = person.getNewMemberType();
        this.name = person.getName();
        this.genre = person.getGenre();
        this.birthDate = person.getBirthDate();
        this.wardID = person.getWard().getId();
    }

    public PersonDTO(Long id, NewMemberType newMemberType, String name, Genre genre, Date birthDate, Long wardID) {
        this.id = id;
        this.newMemberType = newMemberType;
        this.name = name;
        this.genre = genre;
        this.birthDate = birthDate;
        this.wardID = wardID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NewMemberType getNewMemberType() {
        return newMemberType;
    }

    public void setNewMemberType(NewMemberType newMemberType) {
        this.newMemberType = newMemberType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Long getWardID() {
        return wardID;
    }

    public void setWardID(Long wardID) {
        this.wardID = wardID;
    }
}
