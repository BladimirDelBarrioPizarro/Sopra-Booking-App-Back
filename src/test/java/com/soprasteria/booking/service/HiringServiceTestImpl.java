package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;
import com.soprasteria.booking.service.dummy.HiringServiceDummy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HiringServiceTestImpl {

    private HiringService hiringService = mock(HiringService.class);

    @Test
    void findAllTest(){
        List<HiringDTO> hiringDTOList = HiringServiceDummy.hiringDTOListDummy();
        when(hiringService.findAll()).thenReturn(hiringDTOList);
        List<HiringDTO> hiringDTOList2 = hiringService.findAll();
        assert (hiringDTOList2.size() > 0);
    }

    @Test
    void findByIdTest(){
        HiringDTO hiringDTO = HiringServiceDummy.hiringDTODummy();
        given(hiringService.findById(any())).willReturn(hiringDTO);
        HiringDTO hiringDTO1 = hiringService.findById(1L);
        assert (hiringDTO.getId().equals(hiringDTO1.getId()));
    }

    @Test
    void saveHiringTest(){
        HiringDTO hiringDTO = HiringServiceDummy.hiringDTODummy();
        Hiring hiring = HiringServiceDummy.hiringDummy();
        given(hiringService.saveHiring(any())).willReturn(hiringDTO);
        HiringDTO hiringDTO1 = hiringService.saveHiring(hiring);
        assert (hiringDTO.getId().equals(hiringDTO1.getId()));
    }

    @Test
    void updateHiringTest(){
        HiringDTO hiringDTO = HiringServiceDummy.hiringDTODummy();
        hiringDTO.setActive(false);
        Hiring hiring = HiringServiceDummy.hiringDummy();
        hiring.setActive(false);
        given(hiringService.updateHiring(any())).willReturn(hiringDTO);
        HiringDTO hiringDTO1 = hiringService.updateHiring(hiring);
        assert (hiringDTO1.getActive().equals(hiringDTO.getActive()));
    }

}

