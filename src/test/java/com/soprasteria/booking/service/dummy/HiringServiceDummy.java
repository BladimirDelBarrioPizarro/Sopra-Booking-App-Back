package com.soprasteria.booking.service.dummy;

import com.soprasteria.booking.model.dto.HiringDTO;

import java.util.Arrays;
import java.util.List;

public class HiringServiceDummy {

    public static List<HiringDTO> hiringDTOListDummy(){
        return Arrays.asList(
                hiringDTODummy()
        );
    }

    public static HiringDTO hiringDTODummy(){
        return HiringDTO.builder()
                .id(1L)
                .name("Test HiringDTO")
                .need(NeedsServiceDummy.needDummy())
                .build();
    }
}
