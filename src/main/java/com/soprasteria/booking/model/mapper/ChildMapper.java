package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChildMapper {

    public static List<ChildDTO> mapChildListToChildDTOList(List<Child> childList) {
        return childList.stream().map(ChildMapper::mapChildToChildDTO).collect(Collectors.toList());
    }

    private static ChildDTO mapChildToChildDTO(Child child) {
        return  ChildDTO.builder()
                .id(child.getId())
                .name(child.getName())
                .hiringc(child.getHiringc())
                .active(child.getActive())
                .build();
    }

    public static ChildDTO mapOptionalChildToChildDTO(Optional<Child> optionalChild) {
        return ChildDTO.builder()
                .id(optionalChild.get().getId())
                .name(optionalChild.get().getName())
                .hiringc(optionalChild.get().getHiringc())
                .active(true)
                .build();
    }
}
