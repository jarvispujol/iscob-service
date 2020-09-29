package com.iscob.iscob.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.iscob.iscob.entities.Stake;

public class StakeDTO {

    private Long id;

    @JsonProperty("stake_number")
    private Long stakeNumber;
    @JsonProperty("stake_name")
    private String stakeName;
    @JsonProperty("stake_president")
    private String stakePresident;

    public StakeDTO() {
    }

    public StakeDTO(Stake stake) {
        this.id = stake.getId();
        this.stakeName = stake.getStakeName();
        this.stakeNumber = stake.getStakeNumber();
        this.stakePresident = stake.getStakePresident();
    }

    public StakeDTO(Long id, Long stakeNumber, String stakeName, String stakePresident) {
        this.id = id;
        this.stakeNumber = stakeNumber;
        this.stakeName = stakeName;
        this.stakePresident = stakePresident;
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

    public String getStakePresident() {
        return stakePresident;
    }

    public void setStakePresident(String stakePresident) {
        this.stakePresident = stakePresident;
    }
}
