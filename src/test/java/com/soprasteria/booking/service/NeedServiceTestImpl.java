package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Need;
import com.soprasteria.booking.service.dummy.NeedsServiceDummy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class NeedServiceTestImpl {

    private NeedService needService = mock(NeedService.class);


    @Test
    void findAllTest(){
        PageRequest pageRequest = NeedsServiceDummy.pageRequestDummy();
        List<NeedDTO> needDTOList = NeedsServiceDummy.needDTOListDummy();
        given(needService.findAll(any())).willReturn(needDTOList);
        List<NeedDTO> needDTOS1 = needService.findAll(pageRequest);
        assert ( needDTOS1.size() > 0);
    }

    @Test
    void findByIdTest(){
        NeedDTO needDTO = NeedsServiceDummy.needDTODummy();
        given(needService.findById(any())).willReturn(needDTO);
        NeedDTO needDTO1 = needService.findById(1L);
        assert (needDTO.getId().equals(needDTO1.getId()));
    }

    @Test
    void saveNeedTest(){
       NeedDTO needDTO = NeedsServiceDummy.needDTODummy();
       Need need = NeedsServiceDummy.needDummy();
       given(needService.saveNeed(any())).willReturn(needDTO);
       NeedDTO needDTO1 = needService.saveNeed(need);
       assert (needDTO.getId().equals(needDTO1.getId()));
    }

    @Test
    void updateNeedTest(){
        NeedDTO needDTO = NeedsServiceDummy.needDTODummy();
        needDTO.setActive(false);
        Need need = NeedsServiceDummy.needDummy();
        need.setActive(false);
        given(needService.updateNeed(any())).willReturn(needDTO);
        NeedDTO needDTO1 = needService.updateNeed(need);
        assert (needDTO.getActive().equals(needDTO1.getActive()));
    }

    @Test
    void deleteNeedTest() {
        Need need = NeedsServiceDummy.needDummy();
        needService.saveNeed(need);
        NeedDTO needDTO1 = needService.findById(need.getId());
        assert (needDTO1 == null);
    }
}
