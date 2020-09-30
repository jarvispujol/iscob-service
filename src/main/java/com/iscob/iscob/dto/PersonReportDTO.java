package com.iscob.iscob.dto;

import com.iscob.iscob.entities.Person;
import com.iscob.iscob.entities.PersonReport;
import com.iscob.iscob.entities.enums.Priesthood;

import java.util.Date;

public class PersonReportDTO {

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
    private Date dateAdded;
    private Date dateModified;
    private Long personId;

    public PersonReportDTO() {
    }

    public PersonReportDTO(PersonReport personReport) {
        this.id = personReport.getId();
        this.office = personReport.getOffice();
        this.baptismDate = personReport.getBaptismDate();
        this.confirmDate = personReport.getConfirmDate();
        this.bishopInterview = personReport.getBishopInterview();
        this.aaronicPriesthood = personReport.getAaronicPriesthood();
        this.gospelPrincipals = personReport.getGospelPrincipals();
        this.lessonsStart = personReport.getLessonsStart();
        this.lessonsEnd = personReport.getLessonsEnd();
        this.callingDate = personReport.getCallingDate()
        this.attendance = personReport.getAttendance();
        this.genealogy = personReport.getGenealogy();
        this.melchisedec = personReport.getMelchisedec();
        this.vicaryBaptism = personReport.getVicaryBaptism();
        this.templePrep = personReport.getTemplePrep();
        this.templeInv = personReport.getTempleInv();
        this.templeSeal = personReport.getTempleSeal();
        this.dateAdded = Date.from(personReport.getDateAdded());
        this.dateModified = Date.from(personReport.getDateModified());
        this.personId = personReport.getPerson().getId();

    }

    public PersonReportDTO(Long id, Priesthood office, Date baptismDate, Date confirmDate, Date bishopInterview, Date aaronicPriesthood, Date gospelPrincipals, Date lessonsStart, Date lessonsEnd, Date callingDate, Date attendance, Date genealogy, Date melchisedec, Date vicaryBaptism, Date templePrep, Date templeInv, Date templeSeal, Date dateAdded, Date dateModified, Long personId) {
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
        this.personId = personId;
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

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
}
