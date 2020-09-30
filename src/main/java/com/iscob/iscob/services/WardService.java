package com.iscob.iscob.services;

import com.iscob.iscob.dto.WardDTO;
import com.iscob.iscob.entities.Stake;
import com.iscob.iscob.entities.Ward;
import com.iscob.iscob.repositories.StakeRepository;
import com.iscob.iscob.repositories.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WardService {

    @Autowired
    private WardRepository wardRepository;

    @Autowired
    private StakeRepository stakeRepository;

    @Transactional
    public WardDTO save(WardDTO ward){
        Ward entity = new Ward();
        entity.setWardName(ward.getWardName());
        entity.setBishopName(ward.getBishopName());
        entity.setWardNumber(ward.getWardNumber());

        Stake stake = stakeRepository.getOne(ward.getStakeId());
        entity.setStake(stake);

        entity = wardRepository.save(entity);

        return new WardDTO(entity);
    }

    public WardDTO getById(Long id){
        Optional<Ward> ward = wardRepository.findById(id);
        return  new WardDTO(ward.get());
    }

    public List<WardDTO> list(Long id){
        Stake stake = stakeRepository.getOne(id);
        List<Ward> wlist =  wardRepository.findByStake(stake);
        return wlist.stream().map(ward ->
                new WardDTO(ward))
                .collect(Collectors.toList());
    }

    @Transactional
    public WardDTO update(WardDTO ward) {
        Optional<Ward> opt = wardRepository.findById(ward.getId());
        Ward entity = opt.get();
        if(!equals(ward.getWardName())){
            entity.setWardName(ward.getWardName());
        }
        if(ward.getWardNumber() != null){
            entity.setWardNumber(ward.getWardNumber());
        }
        if(!equals(ward.getBishopName())){
            entity.setBishopName(ward.getBishopName());
        }
        if(ward.getStakeId() != null){
            Stake stake = stakeRepository.getOne(ward.getStakeId());
            entity.setStake(stake);
        }

        entity = wardRepository.save(entity);
        return new WardDTO(entity);
    }

    @Transactional
    public void delete(Long id){
        Optional<Ward> opt = wardRepository.findById(id);
        wardRepository.delete(opt.get());
    }

}
