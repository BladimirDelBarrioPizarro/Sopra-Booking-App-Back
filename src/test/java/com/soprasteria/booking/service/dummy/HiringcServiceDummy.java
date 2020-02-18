package com.soprasteria.booking.service.dummy;

import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.entity.Hiringc;
import java.util.Collections;
import java.util.List;

public class HiringcServiceDummy {

    public static List<HiringcDTO> hiringcDTOListDummy(){
        return Collections.singletonList(
                hiringcDTODummy()
        );
    }

    public static HiringcDTO hiringcDTODummy(){
        return HiringcDTO.builder()
                .id(1L)
                .name("Test HiringcDTO")
                .active(true)
                .build();
    }

    public static Hiringc hiringcDummy(){
        return Hiringc.builder()
                .id(1L)
                .name("Test HiringcDTO")
                .active(true)
                .build();
    }
}
