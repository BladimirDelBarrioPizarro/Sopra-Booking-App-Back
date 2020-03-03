package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.ChildDao;
import com.soprasteria.booking.dao.NeedDao;
import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Child;
import com.soprasteria.booking.model.entity.Need;
import com.soprasteria.booking.model.exceptions.*;
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
    private ChildDao childDao;

    public NeedServiceImpl(NeedDao needDao,ChildDao childDao) {
        this.needDao = needDao;
        this.childDao = childDao;
    }

    @Override
    public List<NeedDTO> findAll(Pageable pageable) {
        pageable = pageRequest(pageable);
        try{
            return NeedMapper.mapNeedListToNeedDTO(needDao.findAll(pageable).stream().collect(Collectors.toList()));
        }catch (Exception ex) {
            log.error(" -- ERROR GET/needs {}", ex.getMessage());
            throw new HandleExceptionNeedFindAll(ex);
        }
    }

    @Override
    public NeedDTO findById(Long id) {
        try{
           return NeedMapper.mapNeedOptionalToNeedDTO(needDao.findById(id));
        }catch (Exception ex){
            log.error(" -- ERROR GET /needs/{}",id);
            throw new HandleExceptionNeedFindById(ex);
        }
    }

    @Override
    public NeedDTO saveNeed(Need need) {
        try{
            return NeedMapper.mapNeedToNeedDTO(needDao.save(need));
        }catch (Exception ex){
            log.error(" -- ERROR POST /needs {}",ex.getMessage());
            throw new HandleExceptionNeedSave(ex);
        }
    }

    @Override
    public NeedDTO updateNeed(Need need) {
        try{
             List<Child> childs = need.getChild();
             List<Child> childsResponse =  childs.stream().map(item -> childDao.save(item)).collect(Collectors.toList());
             need.setChild(childsResponse);
            return NeedMapper.mapNeedToNeedDTO(needDao.save(need));
        }catch (Exception ex){
            log.error(" -- ERROR PUT /needs {}",ex.getMessage());
            throw new HandleExceptionNeedUpdate(ex);
        }
    }


    @Override
    public void deleteNeed(Long id){
        try{
            needDao.deleteById(id);
        }catch (Exception ex){
            log.error(" -- ERROR DELETE /needs {}",ex.getMessage());
            throw new HandleExceptionNeedDelete(ex);
        }
    }

    private PageRequest pageRequest(Pageable pageable) {
        Sort sort = pageable.getSort();
        return PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
    }
}
