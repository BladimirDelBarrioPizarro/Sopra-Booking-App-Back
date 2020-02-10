package com.soprasteria.booking.dao;

import com.soprasteria.booking.model.Need;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NeedDao  extends PagingAndSortingRepository<Need,Long> {
}
