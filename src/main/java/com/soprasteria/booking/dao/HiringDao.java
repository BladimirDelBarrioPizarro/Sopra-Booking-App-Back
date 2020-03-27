package com.soprasteria.booking.dao;

import com.soprasteria.booking.model.entity.Hiring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HiringDao extends JpaRepository<Hiring,Long> {
}
