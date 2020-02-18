package com.soprasteria.booking.service.dummy;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HiringServiceDummy {

    public static List<HiringDTO> hiringDTOListDummy(){
        return Collections.singletonList(
                hiringDTODummy()
        );
    }

    public static HiringDTO hiringDTODummy(){
        return HiringDTO.builder()
                .id(1L)
                .name("Test HiringDTO")
                .active(true)
                .build();
    }

    public static Hiring hiringDummy(){
        return Hiring.builder()
                .id(1L)
                .name("Test HiringDTO")
                .active(true)
                .build();
    }
}
