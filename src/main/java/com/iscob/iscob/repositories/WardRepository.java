package com.iscob.iscob.repositories;

import com.iscob.iscob.entities.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardRepository extends JpaRepository<Ward, Long> {
}
