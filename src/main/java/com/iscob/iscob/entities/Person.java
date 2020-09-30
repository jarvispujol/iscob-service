package com.iscob.iscob.entities;


import com.iscob.iscob.entities.enums.Genre;
import com.iscob.iscob.entities.enums.NewMemberType;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private NewMemberType newMemberType;
    private String name;
    private Genre genre;
    private Date birthDate;

    @ManyToOne
    @JoinColumn(name = "ward_id")
    private Ward ward;

    @OneToOne
    private PersonReport report;

    public Person() {}

    public Person(Long id, NewMemberType newMemberType, String name, Genre genre, Date birthDate, Ward ward) {
        this.id = id;
        this.newMemberType = newMemberType;
        this.name = name;
        this.genre = genre;
        this.birthDate = birthDate;
        this.ward = ward;
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

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
