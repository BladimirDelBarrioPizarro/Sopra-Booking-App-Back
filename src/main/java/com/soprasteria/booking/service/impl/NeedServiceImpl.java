package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.NeedDao;
import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Need;
import com.soprasteria.booking.model.mapper.NeedMapper;
import com.soprasteria.booking.service.NeedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;



import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class NeedServiceImpl implements NeedService {

    private NeedDao needDao;

    public NeedServiceImpl(NeedDao needDao) {
        this.needDao = needDao;
    }


    @Override
    public List<NeedDTO> findAll(Pageable pageable) {
        pageable = pageRequest(pageable);
        List<Need> needList;
        try{
            needList = needDao.findAll(pageable).stream().collect(Collectors.toList());
            return NeedMapper.mapNeedListToNeedDTO(needList);
        }catch (Exception ex) {
            log.error(" -- ERROR GET/needs {}", ex.getMessage());
            return null;
        }
    }

    @Override
    public NeedDTO findById(Long id) {
        try{
           return NeedMapper.mapNeedOptionalToNeedDTO(needDao.findById(id));
        }catch (Exception ex){
            log.error(" -- ERROR GET/needs/{} Message:{}",id,ex.getMessage());
        }
        return null;
    }

    private PageRequest pageRequest(Pageable pageable) {
        Sort sort = pageable.getSort();
        return PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
    }
}
