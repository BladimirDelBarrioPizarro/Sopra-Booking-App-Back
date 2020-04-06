package com.soprasteria.booking.dao;

import com.soprasteria.booking.model.entity.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterDao extends JpaRepository<Recruiter,Long> {
}
