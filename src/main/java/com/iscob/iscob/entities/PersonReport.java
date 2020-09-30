package com.iscob.iscob.entities;

import com.iscob.iscob.entities.enums.Priesthood;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "new_converts_report")
public class PersonReport implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Priesthood office;
    private Date baptismDate;
    private Date confirmDate;
    private Date bishopInterview;
    private Date aaronicPriesthood;
    private Date gospelPrincipals;
    private Date lessonsStart;
    private Date lessonsEnd;
    private Date callingDate;
    private Date attendance;
    private Date genealogy;
    private Date melchisedec;
    private Date vicaryBaptism;
    private Date templePrep;
    private Date templeInv;
    private Date templeSeal;

    private Instant dateAdded;
    private Instant dateModified;

    @OneToOne
    private Person person;

    public PersonReport() { }

    public PersonReport(Long id, Priesthood office, Date baptismDate, Date confirmDate, Date bishopInterview, Date aaronicPriesthood, Date gospelPrincipals, Date lessonsStart, Date lessonsEnd, Date callingDate, Date attendance, Date genealogy, Date melchisedec, Date vicaryBaptism, Date templePrep, Date templeInv, Date templeSeal, Instant dateAdded, Instant dateModified, Person person) {
        this.id = id;
        this.office = office;
        this.baptismDate = baptismDate;
        this.confirmDate = confirmDate;
        this.bishopInterview = bishopInterview;
        this.aaronicPriesthood = aaronicPriesthood;
        this.gospelPrincipals = gospelPrincipals;
        this.lessonsStart = lessonsStart;
        this.lessonsEnd = lessonsEnd;
        this.callingDate = callingDate;
        this.attendance = attendance;
        this.genealogy = genealogy;
        this.melchisedec = melchisedec;
        this.vicaryBaptism = vicaryBaptism;
        this.templePrep = templePrep;
        this.templeInv = templeInv;
        this.templeSeal = templeSeal;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Priesthood getOffice() {
        return office;
    }

    public void setOffice(Priesthood office) {
        this.office = office;
    }

    public Date getBaptismDate() {
        return baptismDate;
    }

    public void setBaptismDate(Date baptismDate) {
        this.baptismDate = baptismDate;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public Date getBishopInterview() {
        return bishopInterview;
    }

    public void setBishopInterview(Date bishopInterview) {
        this.bishopInterview = bishopInterview;
    }

    public Date getAaronicPriesthood() {
        return aaronicPriesthood;
    }

    public void setAaronicPriesthood(Date aaronicPriesthood) {
        this.aaronicPriesthood = aaronicPriesthood;
    }

    public Date getGospelPrincipals() {
        return gospelPrincipals;
    }

    public void setGospelPrincipals(Date gospelPrincipals) {
        this.gospelPrincipals = gospelPrincipals;
    }

    public Date getLessonsStart() {
        return lessonsStart;
    }

    public void setLessonsStart(Date lessonsStart) {
        this.lessonsStart = lessonsStart;
    }

    public Date getLessonsEnd() {
        return lessonsEnd;
    }

    public void setLessonsEnd(Date lessonsEnd) {
        this.lessonsEnd = lessonsEnd;
    }

    public Date getCallingDate() {
        return callingDate;
    }

    public void setCallingDate(Date callingDate) {
        this.callingDate = callingDate;
    }

    public Date getAttendance() {
        return attendance;
    }

    public void setAttendance(Date attendance) {
        this.attendance = attendance;
    }

    public Date getGenealogy() {
        return genealogy;
    }

    public void setGenealogy(Date genealogy) {
        this.genealogy = genealogy;
    }

    public Date getMelchisedec() {
        return melchisedec;
    }

    public void setMelchisedec(Date melchisedec) {
        this.melchisedec = melchisedec;
    }

    public Date getVicaryBaptism() {
        return vicaryBaptism;
    }

    public void setVicaryBaptism(Date vicaryBaptism) {
        this.vicaryBaptism = vicaryBaptism;
    }

    public Date getTemplePrep() {
        return templePrep;
    }

    public void setTemplePrep(Date templePrep) {
        this.templePrep = templePrep;
    }

    public Date getTempleInv() {
        return templeInv;
    }

    public void setTempleInv(Date templeInv) {
        this.templeInv = templeInv;
    }

    public Date getTempleSeal() {
        return templeSeal;
    }

    public void setTempleSeal(Date templeSeal) {
        this.templeSeal = templeSeal;
    }

    public Instant getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Instant dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonReport that = (PersonReport) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
