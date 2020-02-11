package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Need;

import java.util.List;
import java.util.stream.Collectors;

public class NeedMapper {
    public static List<NeedDTO> mapNeedListToNeedDTO(List<Need> needList) {
        return needList.stream().map(NeedMapper::mapNeedListToNeedDTO).collect(Collectors.toList());
    }

    public static NeedDTO mapNeedListToNeedDTO(Need need){
        return NeedDTO.builder()
                .id(need.getId())
                .name(need.getName())
                .active(need.getActive())
                .hiring(need.getHiring())
                .build();
    }
}
