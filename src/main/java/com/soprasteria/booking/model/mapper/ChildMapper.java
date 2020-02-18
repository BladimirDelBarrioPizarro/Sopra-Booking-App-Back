package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ChildMapper {

    public static List<ChildDTO> mapChildListToChildDTOList(List<Child> childList) {
        return childList.stream().map(ChildMapper::mapChildToChildDTO).collect(Collectors.toList());
    }

    private static ChildDTO mapChildToChildDTO(Child child) {
        return  ChildDTO.builder()
                .id(child.getId())
                .name(child.getName())
                .hiring(child.getHiringc())
                .active(child.getActive())
                .build();
    }
}
