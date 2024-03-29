package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.HiringDao;
import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;
import com.soprasteria.booking.model.exceptions.*;
import com.soprasteria.booking.model.mapper.HiringMapper;
import com.soprasteria.booking.service.HiringService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class HiringServiceImpl implements HiringService {

    private HiringDao hiringDao;

    public HiringServiceImpl(HiringDao hiringDao) {
        this.hiringDao = hiringDao;
    }

    @Override
    public List<HiringDTO> findAll() {
        try{
            return HiringMapper.mapHiringListToHiringListDTO(hiringDao.findAll().stream().filter(Hiring::getActive).collect(Collectors.toList()));
        }catch (Exception ex){
            log.error(" -- ERROR GET /hirings {}", ex.getMessage());
            throw new HandleExceptionHiringFindAll(ex);
        }
    }

    @Override
    public HiringDTO findById(Long id) {
        try{
            return HiringMapper.mapHiringOptionalToHiringDTO(hiringDao.findById(id));
        }catch (Exception ex){
            log.error(" -- ERROR GET /hirings {} ",id);
            throw new HandleExceptionHiringFindById(ex);
        }
    }

    @Override
    public HiringDTO saveHiring(Hiring hiring) {
        try{
            return HiringMapper.mapHiringToHiringDTO(hiringDao.save(hiring));
        }catch (Exception ex){
            log.error(" -- ERROR POST /hirings {} ",ex.getMessage());
            throw new HandleExceptionHiringSave(ex);
        }
    }

    @Override
    public HiringDTO updateHiring(Hiring hiring) {
        try{
            return HiringMapper.mapHiringToHiringDTO(hiringDao.save(hiring));
        }catch (Exception ex){
            log.error(" -- ERROR PUT /hirings {} ",ex.getMessage());
            throw new HandleExceptionHiringUpdate(ex);
        }
    }

    @Override
    public void deleteHiring(Long id) {
        try{
            hiringDao.deleteById(id);
        }catch (Exception ex){
            log.error(" -- ERROR DELETE /hiring {}",id);
            throw new HandleExceptionHiringDelete(ex);
        }
    }
}


