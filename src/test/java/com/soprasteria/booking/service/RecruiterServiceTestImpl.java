package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.RecruiterDTO;
import com.soprasteria.booking.service.dummy.RecruiterServiceDummy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RecruiterServiceTestImpl {
    private RecruiterService recruiterService = mock(RecruiterService.class);


    @Test
    void findAllTest(){
        List<RecruiterDTO> recruiterDTOList = RecruiterServiceDummy.recruiterDTOListDummy();
        when(recruiterService.findAll()).thenReturn(recruiterDTOList);
        List<RecruiterDTO> recruiterDTOList2 = recruiterService.findAll();
        assert (recruiterDTOList2.size() > 0);
    }

    @Test
    void findByIdTest(){
        RecruiterDTO recruiterDTO = RecruiterServiceDummy.recruiterDTODummy();
        when(recruiterService.findById(any())).thenReturn(recruiterDTO);
        RecruiterDTO recruiterDTO2 = recruiterService.findById(1L);
        assert (recruiterDTO2.getId().equals(recruiterDTO.getId()));
    }
}

