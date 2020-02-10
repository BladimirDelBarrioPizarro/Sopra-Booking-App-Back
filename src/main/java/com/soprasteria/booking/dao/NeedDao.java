package com.soprasteria.booking.dao;

import com.soprasteria.booking.model.Need;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NeedDao  extends JpaRepository<Need,Long> {
}
