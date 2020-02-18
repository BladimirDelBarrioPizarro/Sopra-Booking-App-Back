package com.soprasteria.booking.service;


import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.entity.Hiringc;
import com.soprasteria.booking.service.dummy.HiringServiceDummy;
import com.soprasteria.booking.service.dummy.HiringcServiceDummy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HiringcServiceTestImpl {

    private HiringcService hiringcService = mock(HiringcService.class);

    @Test
    void findAllTest(){
        List<HiringcDTO> hiringcDTOList = HiringcServiceDummy.hiringcDTOListDummy();
        when(hiringcService.findAll()).thenReturn(hiringcDTOList);
        List<HiringcDTO> hiringcDTOList2 = hiringcService.findAll();
        assert (hiringcDTOList2.size() > 0);
    }

    @Test
    void findByIdTest(){
        HiringcDTO hiringcDTO = HiringcServiceDummy.hiringcDTODummy();
        when(hiringcService.findById(any())).thenReturn(hiringcDTO);
        HiringcDTO hiringcDTO2 = hiringcService.findById(1L);
        assert (hiringcDTO.getId().equals(hiringcDTO2.getId()));
    }

    @Test
    void saveHiringcTest(){
        HiringcDTO hiringcDTO = HiringcServiceDummy.hiringcDTODummy();
        Hiringc hiringc = HiringcServiceDummy.hiringcDummy();
        when(hiringcService.saveHiringc(any())).thenReturn(hiringcDTO);
        HiringcDTO hiringcDTO2 = hiringcService.saveHiringc(hiringc);
        assert (hiringcDTO.getId().equals(hiringcDTO2.getId()));
    }

    @Test
    void updateHiringcTest(){
        HiringcDTO hiringcDTO = HiringcServiceDummy.hiringcDTODummy();
        hiringcDTO.setActive(false);
        Hiringc hiringc = HiringcServiceDummy.hiringcDummy();
        hiringc.setActive(false);
        when(hiringcService.updateHiringc(any())).thenReturn(hiringcDTO);
        HiringcDTO hiringcDTO2 = hiringcService.updateHiringc(hiringc);
        assert (hiringcDTO2.getActive().equals(hiringcDTO.getActive()));
    }

    @Test
    void deleteHiringcTest(){
        Hiringc hiringc = HiringcServiceDummy.hiringcDummy();
        hiringcService.saveHiringc(hiringc);
        hiringcService.deleteHiringc(hiringc.getId());
        HiringcDTO hiringcDTO = hiringcService.findById(hiringc.getId());
        assert (hiringcDTO == null);
    }
}

