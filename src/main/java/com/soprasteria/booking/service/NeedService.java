package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Need;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface NeedService {
    List<NeedDTO> findAll(Pageable pageable);
    NeedDTO findById(Long id);
    NeedDTO saveNeed(Need need);
    NeedDTO updateNeed(Need need);
    void deleteNeed(Long id);
}


