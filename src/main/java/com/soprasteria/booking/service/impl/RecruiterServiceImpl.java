package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.RecruiterDao;
import com.soprasteria.booking.model.dto.RecruiterDTO;
import com.soprasteria.booking.model.entity.Recruiter;
import com.soprasteria.booking.model.exceptions.HandleExceptionRecruiterDelete;
import com.soprasteria.booking.model.exceptions.HandleExceptionRecruiterFindAll;
import com.soprasteria.booking.model.exceptions.HandleExceptionRecruiterFindById;
import com.soprasteria.booking.model.exceptions.HandleExceptionRecruiterSave;
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
            throw new HandleExceptionRecruiterFindAll(ex);
        }

    }

    @Override
    public RecruiterDTO findById(Long id) {
        try{
            return RecruiterMapper.mapRecruiterOptionalToRecruiterDTO(recruiterDao.findById(id));
        }catch (Exception ex){
            log.error(" -- ERROR GET /recruiter {} ",id);
            throw new HandleExceptionRecruiterFindById(ex);
        }
    }

    @Override
    public RecruiterDTO saveRecruiter(Recruiter recruiter) {
        try{
            return RecruiterMapper.mapRecruiterToRecruiterDTO(recruiterDao.save(recruiter));
        }catch (Exception ex){
            log.error(" -- ERROR POST /recruiter {}", ex.getMessage());
            throw new HandleExceptionRecruiterSave(ex);
        }
    }

    @Override
    public void deleteRecruiter(Long id) {
        try{
            recruiterDao.deleteById(id);
        }catch (Exception ex){
            log.error(" -- ERROR DELETE /recruiter {}",id);
            throw new HandleExceptionRecruiterDelete(ex);
        }
    }
}

