package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;


import java.util.List;

public interface HiringService {
    List<HiringDTO> findAll();
    HiringDTO findById(Long id);
    HiringDTO saveHiring(Hiring hiring);
}
