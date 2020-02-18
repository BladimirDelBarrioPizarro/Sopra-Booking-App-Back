package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.entity.Hiringc;

import java.util.List;

public interface HiringcService {
    List<HiringcDTO> findAll();
    HiringcDTO findById(Long id);
    HiringcDTO saveHiringc(Hiringc hiringc);
}
