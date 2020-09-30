package com.iscob.iscob.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.iscob.iscob.entities.Ward;

public class WardDTO {

    private Long id;
    @JsonProperty("ward_number")
    private Long wardNumber;
    @JsonProperty("ward_name")
    private String wardName;
    @JsonProperty("bishop_name")
    private String bishopName;
    @JsonProperty("stake_id")
    private Long stakeId;

    public WardDTO() {
    }

    public WardDTO(Ward ward) {
        this.id = ward.getId();
        this.wardNumber = ward.getWardNumber();
        this.wardName = ward.getWardName();
        this.bishopName = ward.getBishopName();
        this.stakeId = ward.getStake().getId();
    }

    public WardDTO(Long id, Long wardNumber, String wardName, String bishopName, Long stakeId) {
        this.id = id;
        this.wardNumber = wardNumber;
        this.wardName = wardName;
        this.bishopName = bishopName;
        this.stakeId = stakeId;
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

    public String getBishopName() {
        return bishopName;
    }

    public void setBishopName(String bishopName) {
        this.bishopName = bishopName;
    }

    public Long getStakeId() {
        return stakeId;
    }

    public void setStakeId(Long stakeId) {
        this.stakeId = stakeId;
    }
}
