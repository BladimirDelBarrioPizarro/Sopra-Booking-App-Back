package com.soprasteria.booking.dao;

import com.soprasteria.booking.model.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildDao extends JpaRepository<Child,Long> {
}
