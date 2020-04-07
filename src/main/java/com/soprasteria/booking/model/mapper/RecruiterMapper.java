package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.RecruiterDTO;
import com.soprasteria.booking.model.entity.Recruiter;

import java.util.List;
import java.util.stream.Collectors;

public class RecruiterMapper {

    public static List<RecruiterDTO> mapRecruiterListToRecruiterDTOList(List<Recruiter> recruiters){
        return recruiters.stream().map(RecruiterMapper::mapRecruiterToRecruiterDTO).collect(Collectors.toList());
    }

    public static RecruiterDTO mapRecruiterToRecruiterDTO(Recruiter recruiter) {
        return RecruiterDTO.builder()
                .id(recruiter.getId())
                .name(recruiter.getName())
                .surname(recruiter.getSurname())
                .initials(recruiter.getInitials())
                .build();
    }

}
