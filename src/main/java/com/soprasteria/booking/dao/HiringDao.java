package com.soprasteria.booking.dao;

import com.soprasteria.booking.model.Hiring;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HiringDao extends PagingAndSortingRepository<Hiring,Long> {
}
