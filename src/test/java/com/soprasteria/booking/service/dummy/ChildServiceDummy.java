package com.soprasteria.booking.service.dummy;

import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChildServiceDummy {

    public static List<ChildDTO> childDTOListDummy(){
        return Collections.singletonList(childDTODummy());
    }

    public static ChildDTO childDTODummy() {
        return  ChildDTO.builder()
                .id(1L)
                .active(true)
                .hiringc(new ArrayList<>())
                .name("Test name")
                .build();
    }

    public static Child childDummy(){
        return Child.builder()
                .id(1L)
                .hiringc(new ArrayList<>())
                .active(true)
                .name("Test name")
                .build();
    }
}

