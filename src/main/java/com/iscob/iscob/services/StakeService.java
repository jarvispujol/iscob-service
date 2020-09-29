package com.iscob.iscob.services;

import com.iscob.iscob.dto.StakeDTO;
import com.iscob.iscob.entities.Stake;
import com.iscob.iscob.entities.Ward;
import com.iscob.iscob.repositories.StakeRepository;
import com.iscob.iscob.repositories.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StakeService {

    @Autowired
    private StakeRepository stakeRepository;

    @Autowired
    private WardRepository wardRepository;

    public StakeDTO save(StakeDTO stake){

        Stake entity = new Stake();
        entity.setStakeName(stake.getStakeName());
        entity.setStakeNumber(stake.getStakeNumber());
        entity.setStakePresident(stake.getStakePresident());

        entity = stakeRepository.save(entity);
        return new StakeDTO(entity);
    }

    public StakeDTO findById(Long id){
        Optional<Stake> opt = stakeRepository.findById(id);
        return new StakeDTO(opt.get());
    }

    public StakeDTO update(Long id, StakeDTO stake){

        Optional<Stake> opt = stakeRepository.findById(id);
        Stake entity = opt.get();

        if(stake.getStakeName() != null ){
            entity.setStakeName(stake.getStakeName());
        }
        if(stake.getStakeNumber() != null ){
            entity.setStakeNumber(stake.getStakeNumber());
        }
        if(stake.getStakePresident() != null ){
            entity.setStakePresident(stake.getStakePresident());
        }
        entity = stakeRepository.save(entity);
        return new StakeDTO(entity);
    }

    public void delete(Long id){
        Optional<Stake> opt = stakeRepository.findById(id);
        stakeRepository.delete(opt.get());
    }

    public List<StakeDTO> list(){
        List<Stake> stakeList = stakeRepository.findAll();
        return stakeList.stream().map( stake -> new StakeDTO(stake)).collect(Collectors.toList());
    }

}
