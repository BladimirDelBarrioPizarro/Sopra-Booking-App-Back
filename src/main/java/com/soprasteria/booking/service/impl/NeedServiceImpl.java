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
import org.springframework.transaction.annotation.Transactional;


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
        try{
            List<Need> needDTOS = (List<Need>) needDao.findAll();
            return NeedMapper.mapNeedListToNeedDTO(needDao.findAll(pageable).stream().collect(Collectors.toList()));
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
            log.error(" -- ERROR GET /needs/{} Message:{}",id,ex.getMessage());
            //throw new HandleExceptionfindNeedById(ex);
            return null;
        }
    }

    @Override
    public NeedDTO saveNeed(Need need) {
        try{
            return NeedMapper.mapNeedToNeedDTO(needDao.save(need));
        }catch (Exception ex){
            log.error(" -- ERROR POST /needs {}",ex.getMessage());
            //throw new HandleExceptionSaveNeed(ex);
            return null;
        }
    }

    @Override
    public NeedDTO updateNeed(Need need) {
        try{
            return NeedMapper.mapNeedToNeedDTO(needDao.save(need));
        }catch (Exception ex){
            log.error(" -- ERROR PUT /needs {}",ex.getMessage());
            //throw new HandleExceptionSaveNeed(ex);
            return null;
        }
    }


    @Override
    public void deleteNeed(Long id){
        try{
            needDao.deleteById(id);
        }catch (Exception ex){
            log.error(" -- ERROR DELETE /needs {}",ex.getMessage());
        }
    }

    private PageRequest pageRequest(Pageable pageable) {
        Sort sort = pageable.getSort();
        return PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
    }
}
