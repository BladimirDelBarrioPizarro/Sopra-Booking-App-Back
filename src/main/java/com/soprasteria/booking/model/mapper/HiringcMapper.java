package com.soprasteria.booking.model.mapper;


import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.entity.Hiringc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HiringcMapper {

    public static List<HiringcDTO> mapHiringcListToHiringcListDTO(List<Hiringc> hiringcList) {
        return hiringcList.stream().map(HiringcMapper::mapHiringcToHiringcDTO).collect(Collectors.toList());
    }

    public static HiringcDTO mapHiringcToHiringcDTO(Hiringc hiringc) {
        return HiringcDTO.builder()
                .id(hiringc.getId())
                .name(hiringc.getName())
                .active(hiringc.getActive())
                .build();
    }

    public static HiringcDTO mapHiringcOptionalToHiringcDTO(Optional<Hiringc> hiringcOptional) {
        return HiringcDTO.builder()
                .id(hiringcOptional.get().getId())
                .name(hiringcOptional.get().getName())
                .active(hiringcOptional.get().getActive())
                .build();
    }
}
