package com.iscob.iscob.repositories;

import com.iscob.iscob.entities.NewConvertsReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewConvertsReportRepository extends JpaRepository<NewConvertsReport, Long> {
}
