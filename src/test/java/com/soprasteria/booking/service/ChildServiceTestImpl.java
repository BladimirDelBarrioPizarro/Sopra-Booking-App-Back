package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.service.dummy.ChildServiceDummy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ChildServiceTestImpl {

    private ChildService childService = mock(ChildService.class);


    @Test
    void findAllTest(){
        List<ChildDTO> childDTOList = ChildServiceDummy.childDTOListDummy();
        when(childService.findAll()).thenReturn(childDTOList);
        List<ChildDTO> childDTOList2 = childService.findAll();
        assert (childDTOList2.size() > 0);
    }
}
