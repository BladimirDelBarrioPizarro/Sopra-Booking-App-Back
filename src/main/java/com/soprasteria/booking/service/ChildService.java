package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;


import java.util.List;

public interface ChildService {
    List<Child> findAll();
}
