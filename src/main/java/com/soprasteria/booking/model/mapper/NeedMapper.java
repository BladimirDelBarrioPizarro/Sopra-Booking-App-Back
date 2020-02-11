package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Need;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NeedMapper {
    public static List<NeedDTO> mapNeedListToNeedDTO(List<Need> needList) {
        return needList.stream().map(NeedMapper::mapNeedToNeedDTO).collect(Collectors.toList());
    }

    public static NeedDTO mapNeedToNeedDTO(Need need){
        return NeedDTO.builder()
                .id(need.getId())
                .name(need.getName())
                .active(need.getActive())
                .hiring(need.getHiring())
                .build();
    }

    public static NeedDTO mapNeedOptionalToNeedDTO(Optional<Need> need) {
        return NeedDTO.builder()
                .id(need.get().getId())
                .name(need.get().getName())
                .hiring(need.get().getHiring())
                .active(need.get().getActive())
                .build();
    }
}
