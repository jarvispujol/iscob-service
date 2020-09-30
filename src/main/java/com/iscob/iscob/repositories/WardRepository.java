package com.iscob.iscob.repositories;

import com.iscob.iscob.entities.Stake;
import com.iscob.iscob.entities.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WardRepository extends JpaRepository<Ward, Long> {

    List<Ward> findByStake(Stake stake);
}
