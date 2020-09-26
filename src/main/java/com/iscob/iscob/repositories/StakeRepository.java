package com.iscob.iscob.repositories;

import com.iscob.iscob.entities.Stake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StakeRepository extends JpaRepository<Stake, Long> {
}
