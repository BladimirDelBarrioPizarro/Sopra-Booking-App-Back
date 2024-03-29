package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.HiringcDao;
import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.entity.Hiringc;
import com.soprasteria.booking.model.exceptions.*;
import com.soprasteria.booking.model.mapper.HiringcMapper;
import com.soprasteria.booking.service.HiringcService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class HiringcServiceImpl implements HiringcService {

    private HiringcDao hiringcDao;

    public HiringcServiceImpl(HiringcDao hiringcDao) {
        this.hiringcDao = hiringcDao;
    }

    @Override
    public List<HiringcDTO> findAll() {
        try{
            return HiringcMapper.mapHiringcListToHiringcListDTO(hiringcDao.findAll().stream().filter(Hiringc::getActive).collect(Collectors.toList()));
        }catch (Exception ex){
            log.error(" -- ERROR GET /hiringsc {}", ex.getMessage());
            throw new HandleExceptionHiringFindAll(ex);
        }
    }

    @Override
    public HiringcDTO findById(Long id) {
        try{
            return HiringcMapper.mapHiringcOptionalToHiringcDTO(hiringcDao.findById(id));
        }catch (Exception ex){
            log.error(" -- ERROR GET /hiringsc {}",id);
            throw new HandleExceptionHiringFindById(ex);
        }

    }

    @Override
    public HiringcDTO saveHiringc(Hiringc hiringc) {
        try{
            return HiringcMapper.mapHiringcToHiringcDTO(hiringcDao.save(hiringc));
        }catch (Exception ex){
            log.error(" -- ERROR POST /hiringsc {} ",ex.getMessage());
            throw new HandleExceptionHiringSave(ex);
        }
    }

    @Override
    public HiringcDTO updateHiringc(Hiringc hiringc) {
        try{
            return HiringcMapper.mapHiringcToHiringcDTO(hiringcDao.save(hiringc));
        }catch (Exception ex){
            log.error(" -- ERROR PUT /hiringsc {} ",ex.getMessage());
            throw new HandleExceptionHiringUpdate(ex);
        }
    }

    @Override
    public void deleteHiringc(Long id) {
        try{
            hiringcDao.deleteById(id);
        }catch (Exception ex){
            log.error(" -- ERROR DELETE /hirings {} ",id);
            throw new HandleExceptionHiringDelete(ex);
        }
    }
}
