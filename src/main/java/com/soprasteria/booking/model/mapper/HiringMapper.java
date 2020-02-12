package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HiringMapper {
    public static List<HiringDTO> mapHiringListToHiringListDTO(List<Hiring> hiringList) {
        return hiringList.stream().map(HiringMapper::mapHiringToHiringDTO).collect(Collectors.toList());
    }

    public static HiringDTO mapHiringToHiringDTO(Hiring hiring) {
        return HiringDTO.builder()
                .id(hiring.getId())
                .name(hiring.getName())
                .active(hiring.getActive())
                .build();
    }

    public static HiringDTO mapHiringOptionalToHiringDTO(Optional<Hiring> hiringOptional) {
        return HiringDTO.builder()
                .id(hiringOptional.get().getId())
                .name(hiringOptional.get().getName())
                .active(hiringOptional.get().getActive())
                .build();
    }
}
