package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;

import java.util.List;
import java.util.stream.Collectors;

public class HiringMapper {
    public static List<HiringDTO> mapHiringListToHiringListDTO(List<Hiring> hiringList) {
        return hiringList.stream().map(HiringMapper::mapHiringToHiringDTO).collect(Collectors.toList());
    }

    private static HiringDTO mapHiringToHiringDTO(Hiring hiring) {
        return HiringDTO.builder()
                .id(hiring.getId())
                .name(hiring.getName())
                .build();
    }

}