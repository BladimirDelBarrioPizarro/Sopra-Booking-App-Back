package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.HiringcDao;
import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.mapper.HiringMapper;
import com.soprasteria.booking.model.mapper.HiringcMapper;
import com.soprasteria.booking.service.HiringcService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class HiringcServiceImpl implements HiringcService {

    private HiringcDao hiringcDao;

    public HiringcServiceImpl(HiringcDao hiringcDao) {
        this.hiringcDao = hiringcDao;
    }

    @Override
    public List<HiringcDTO> findAll() {
        try{
            return HiringcMapper.mapHiringcListToHiringcListDTO(hiringcDao.findAll());
        }catch (Exception ex){
            log.error(" -- ERROR GET /hiringsc {}", ex.getMessage());
            return null;
        }
    }
}

