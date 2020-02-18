package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.ChildDao;
import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;
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
            return null;
        }
    }

    @Override
    public ChildDTO findById(Long id) {
        try{
            return ChildMapper.mapOptionalChildToChildDTO(childDao.findById(id));
        }catch (Exception ex){
            log.error(" -- ERROR GET /childs {} ",id);
            return null;
        }
    }

    @Override
    public ChildDTO saveChild(Child child) {
        try{
            return ChildMapper.mapChildToChildDTO(childDao.save(child));
        }catch (Exception ex){
            log.error(" -- ERROR POST /childs {} ",ex.getMessage());
            return null;
        }
    }

    @Override
    public ChildDTO updateChild(Child child) {
        try{
            return ChildMapper.mapChildToChildDTO(childDao.save(child));
        }catch (Exception ex){
            log.error(" -- ERROR PUT /childs {} ",ex.getMessage());
            return null;
        }
    }

    @Override
    public void deleteChild(Long id) {
        try{
            childDao.deleteById(id);
        }catch (Exception ex){
            log.error(" -- ERROR DELETE /childs {} ",id);
        }
    }
}
