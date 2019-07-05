package com.fatihs.coursemanagement.dao;

import com.fatihs.coursemanagement.entity.Advisors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvisorRepository extends JpaRepository<Advisors, Long> {
}
