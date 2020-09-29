package com.iscob.iscob.entities;

import com.iscob.iscob.dto.WardDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ward")
public class Ward implements Serializable  {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long wardNumber;
    private String wardName;
    private String bishopName;

    @ManyToOne
    @JoinColumn(name = "stake_id")
    private Stake stake;

    @OneToMany(mappedBy = "ward")
    private List<Person> personList = new ArrayList<>();

    public Ward() {
    }

    public Ward(Long id, Long wardNumber, String wardName, Stake stake, String bishopName) {
        this.id = id;
        this.wardNumber = wardNumber;
        this.wardName = wardName;
        this.stake = stake;
        this.bishopName = bishopName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWardNumber() {
        return wardNumber;
    }

    public void setWardNumber(Long wardNumber) {
        this.wardNumber = wardNumber;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public Stake getStake() {
        return stake;
    }

    public void setStake(Stake stake) {
        this.stake = stake;
    }

    public String getBishopName() {
        return bishopName;
    }

    public void setBishopName(String bishopName) {
        this.bishopName = bishopName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ward ward = (Ward) o;
        return Objects.equals(id, ward.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
