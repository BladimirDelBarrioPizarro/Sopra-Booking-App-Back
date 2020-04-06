package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.RecruiterController;
import com.soprasteria.booking.model.dto.RecruiterDTO;
import com.soprasteria.booking.model.entity.Recruiter;
import com.soprasteria.booking.service.RecruiterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Slf4j
public class RecruiterControllerImpl implements RecruiterController {

    public RecruiterService recruiterService;

    public RecruiterControllerImpl(RecruiterService recruiterService) {
        this.recruiterService = recruiterService;
    }

    @Override
    public ResponseEntity<List<RecruiterDTO>> findById() {
        log.info(" -- GET /recruiter");
        return new ResponseEntity<>(recruiterService.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RecruiterDTO> saveRecruiter(Recruiter recruiter) {
        log.info(" -- POST /recruiter {}",recruiter.getName());
        return new ResponseEntity<>(recruiterService.saveRecruiter(recruiter),HttpStatus.OK);
    }
}
