package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.HiringDTO;


import java.util.List;

public interface HiringService {
    List<HiringDTO> findAll();
}
