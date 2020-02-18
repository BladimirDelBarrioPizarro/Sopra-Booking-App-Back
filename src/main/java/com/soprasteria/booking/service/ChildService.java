package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;


import java.util.List;

public interface ChildService {
    List<ChildDTO> findAll();
    ChildDTO findById(Long id);
    ChildDTO saveChild(Child child);
    ChildDTO updateChild(Child child);
}
