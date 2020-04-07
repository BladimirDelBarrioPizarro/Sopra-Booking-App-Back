package com.soprasteria.booking.service.dummy;

import com.soprasteria.booking.model.dto.RecruiterDTO;
import com.soprasteria.booking.model.entity.Recruiter;

import java.util.Collections;
import java.util.List;

public class RecruiterServiceDummy {

    public static List<RecruiterDTO> recruiterDTOListDummy(){
        return Collections.singletonList(recruiterDTODummy());
    }

    private static RecruiterDTO recruiterDTODummy() {
        return RecruiterDTO.builder()
                .id(1L)
                .surname("surname test")
                .initials("XXX")
                .build();
    }

    private static Recruiter recruiterDummy(){
        return  Recruiter.builder()
                .id(2L)
                .surname("Bladimir del Barrio Pizarro")
                .initials("BBP")
                .build();
    }
}

