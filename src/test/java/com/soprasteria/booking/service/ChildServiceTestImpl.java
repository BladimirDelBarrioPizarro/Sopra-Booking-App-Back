package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;
import com.soprasteria.booking.service.dummy.ChildServiceDummy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
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

    @Test
    void findBtyIdTest(){
        ChildDTO childDTO = ChildServiceDummy.childDTODummy();
        when(childService.findById(any())).thenReturn(childDTO);
        ChildDTO childDTO2 = childService.findById(1L);
        assert (childDTO2.getId().equals(childDTO.getId()));
    }

    @Test
    void saveChildTest(){
        ChildDTO childDTO = ChildServiceDummy.childDTODummy();
        Child child = ChildServiceDummy.childDummy();
        when(childService.saveChild(any())).thenReturn(childDTO);
        ChildDTO childDTO2 = childService.saveChild(child);
        assert (childDTO2.getId().equals(childDTO.getId()));
    }

    @Test
    void updateChildTest(){
        ChildDTO childDTO = ChildServiceDummy.childDTODummy();
        childDTO.setActive(false);
        Child child = ChildServiceDummy.childDummy();
        child.setActive(false);
        when(childService.updateChild(any())).thenReturn(childDTO);
        ChildDTO childDTO2 = childService.updateChild(child);
        assert (childDTO2.getActive().equals(childDTO.getActive()));
    }

    @Test
    void deleteChildTest(){
        Child child = ChildServiceDummy.childDummy();
        childService.saveChild(child);
        childService.deleteChild(child.getId());
        ChildDTO childDTO = childService.findById(child.getId());
        assert (childDTO == null);
    }
}

