package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;
import com.soprasteria.booking.service.dummy.HiringServiceDummy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.ParseException;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HiringServiceTestImpl {

    private HiringService hiringService = mock(HiringService.class);


    @Test
    void findAllTest() throws ParseException {
        List<HiringDTO> hiringDTOList = HiringServiceDummy.hiringDTOListDummy();
        when(hiringService.findAll()).thenReturn(hiringDTOList);
        List<HiringDTO> hiringDTOList2 = hiringService.findAll();
        assert (hiringDTOList2.size() > 0);
    }

    @Test
    void findByIdTest() throws ParseException {
        HiringDTO hiringDTO = HiringServiceDummy.hiringDTODummy();
        given(hiringService.findById(any())).willReturn(hiringDTO);
        HiringDTO hiringDTO1 = hiringService.findById(1L);
        assert (hiringDTO.getId().equals(hiringDTO1.getId()));
    }

    @Test
    void saveHiringTest() throws ParseException {
        HiringDTO hiringDTO = HiringServiceDummy.hiringDTODummy();
        Hiring hiring = HiringServiceDummy.hiringDummy();
        given(hiringService.saveHiring(any())).willReturn(hiringDTO);
        HiringDTO hiringDTO1 = hiringService.saveHiring(hiring);
        assert (hiringDTO.getId().equals(hiringDTO1.getId()));
    }

    @Test
    void updateHiringTest() throws ParseException {
        HiringDTO hiringDTO = HiringServiceDummy.hiringDTODummy();
        hiringDTO.setActive(false);
        Hiring hiring = HiringServiceDummy.hiringDummy();
        hiring.setActive(false);
        given(hiringService.updateHiring(any())).willReturn(hiringDTO);
        HiringDTO hiringDTO1 = hiringService.updateHiring(hiring);
        assert (hiringDTO1.getActive().equals(hiringDTO.getActive()));
    }

    @Test
    void deleteHiringTest() throws ParseException {
        Hiring hiring = HiringServiceDummy.hiringDummy();
        hiringService.saveHiring(hiring);
        hiringService.deleteHiring(hiring.getId());
        HiringDTO hiringDTO = hiringService.findById(hiring.getId());
        assert (hiringDTO == null);
    }
}
