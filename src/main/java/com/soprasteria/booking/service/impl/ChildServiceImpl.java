package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.ChildDao;
import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;
import com.soprasteria.booking.model.exceptions.*;
import com.soprasteria.booking.model.mapper.ChildMapper;
import com.soprasteria.booking.service.ChildService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ChildServiceImpl implements ChildService {

    private ChildDao childDao;

    public ChildServiceImpl(ChildDao childDao) {
        this.childDao = childDao;
    }

    @Override
    public List<ChildDTO> findAll() {
        try{
            return ChildMapper.mapChildListToChildDTOList(childDao.findAll());
        }catch (Exception ex){
            log.error(" -- ERROR GET /childs {} ",ex.getMessage());
            throw new HandleExceptionChildFindAll(ex);
        }
    }

    @Override
    public ChildDTO findById(Long id) {
        try{
            return ChildMapper.mapOptionalChildToChildDTO(childDao.findById(id));
        }catch (Exception ex){
            log.error(" -- ERROR GET /childs {} ",id);
            throw new HandleExceptionChildFindById(ex);
        }
    }

    @Override
    public ChildDTO saveChild(Child child) {
        try{
            return ChildMapper.mapChildToChildDTO(childDao.save(child));
        }catch (Exception ex){
            log.error(" -- ERROR POST /childs {} ",ex.getMessage());
            throw new HandleExceptionChildSave(ex);
        }
    }

    @Override
    public ChildDTO updateChild(Child child) {
        try{
            return ChildMapper.mapChildToChildDTO(childDao.save(child));
        }catch (Exception ex){
            log.error(" -- ERROR PUT /childs {} ",ex.getMessage());
            throw new HandleExceptionChildUpdate(ex);
        }
    }

    @Override
    public void deleteChild(Long id) {
        try{
            childDao.deleteById(id);
        }catch (Exception ex){
            log.error(" -- ERROR DELETE /childs {} ",id);
            throw new HandleExceptionChildDelete(ex);
        }
    }
}
