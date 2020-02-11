package com.soprasteria.booking.service.dummy;

import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Hiring;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NeedsServiceDummy {

    public static PageRequest pageRequestDummy(){
        return  PageRequest.of(0, 5, Sort.Direction.DESC, "name");
    }


    public static NeedDTO needDTODummy(){
        return NeedDTO.builder()
                .id(1L)
                .name("Test Need")
                .hiring(Arrays.asList(new Hiring(1L,"Full Stack",true)))
                .build();
    }

    public static List<NeedDTO> needDTOListDummy(){
        return Arrays.asList(needDTODummy());
    }


}
