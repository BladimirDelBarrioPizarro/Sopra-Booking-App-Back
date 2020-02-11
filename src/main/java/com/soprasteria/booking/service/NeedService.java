package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.NeedDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NeedService {
    List<NeedDTO> findAll(Pageable pageable);
    NeedDTO findById(Long id);
}


