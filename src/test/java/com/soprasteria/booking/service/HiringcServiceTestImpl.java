package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.service.dummy.HiringServiceDummy;
import com.soprasteria.booking.service.dummy.HiringcServiceDummy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

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

}
