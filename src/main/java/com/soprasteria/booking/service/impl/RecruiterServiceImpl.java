package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.RecruiterDao;
import com.soprasteria.booking.model.dto.RecruiterDTO;
import com.soprasteria.booking.model.entity.Recruiter;
import com.soprasteria.booking.model.mapper.RecruiterMapper;
import com.soprasteria.booking.service.RecruiterService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class RecruiterServiceImpl implements RecruiterService {

    private RecruiterDao recruiterDao;

    public RecruiterServiceImpl(RecruiterDao recruiterDao) {
        this.recruiterDao = recruiterDao;
    }

    @Override
    public List<RecruiterDTO> findAll() {
        try{
            return RecruiterMapper.mapRecruiterListToRecruiterDTOList(recruiterDao.findAll());
        }catch (Exception ex){
            log.error(" -- ERROR GET /recruiter {}", ex.getMessage());
            //throw new HandleExceptionRecruiterFindAll(ex);
            return null;
        }

    }

    @Override
    public RecruiterDTO saveRecruiter(Recruiter recruiter) {
        return null;
    }




    /*
    *
    *  @Override
    public List<HiringDTO> findAll() {
        try{
            return HiringMapper.mapHiringListToHiringListDTO(hiringDao.findAll().stream().filter(Hiring::getActive).collect(Collectors.toList()));
        }catch (Exception ex){
            log.error(" -- ERROR GET /hirings {}", ex.getMessage());
            throw new HandleExceptionHiringFindAll(ex);
        }
    }
    *
    *
    *
    *
    *
    * */

    /*
    *
    * @Override
    public HiringDTO saveHiring(Hiring hiring) {
        try{
            return HiringMapper.mapHiringToHiringDTO(hiringDao.save(hiring));
        }catch (Exception ex){
            log.error(" -- ERROR POST /hirings {} ",ex.getMessage());
            throw new HandleExceptionHiringSave(ex);
        }
    }
    *
    *
    *
    * */
}
