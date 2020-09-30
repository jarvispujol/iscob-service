package com.iscob.iscob.repositories;

import com.iscob.iscob.entities.PersonReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonReportRepository extends JpaRepository<PersonReport, Long> {
}
