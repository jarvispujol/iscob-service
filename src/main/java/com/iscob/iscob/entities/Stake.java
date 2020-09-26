package com.iscob.iscob.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "stake")
public class Stake implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long stakeNumber;
    private String stakeName;

    @OneToMany(mappedBy = "stake")
    private List<Ward> wardList = new ArrayList<>();

    public Stake() {
    }

    public Stake(Long id, Long stakeNumber, String stakeName) {
        this.id = id;
        this.stakeNumber = stakeNumber;
        this.stakeName = stakeName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStakeNumber() {
        return stakeNumber;
    }

    public void setStakeNumber(Long stakeNumber) {
        this.stakeNumber = stakeNumber;
    }

    public String getStakeName() {
        return stakeName;
    }

    public void setStakeName(String stakeName) {
        this.stakeName = stakeName;
    }

    public List<Ward> getWardList() {
        return wardList;
    }

    public void setWardList(List<Ward> wardList) {
        this.wardList = wardList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stake stake = (Stake) o;
        return Objects.equals(id, stake.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
