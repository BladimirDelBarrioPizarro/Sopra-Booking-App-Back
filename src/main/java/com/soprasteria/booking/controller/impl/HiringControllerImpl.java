package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.HiringController;
import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;
import com.soprasteria.booking.service.HiringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Objects;

@Slf4j
public class HiringControllerImpl implements HiringController {

    private HiringService hiringService;

    public HiringControllerImpl(HiringService hiringService) {
        this.hiringService = hiringService;
    }

    @Override
    public ResponseEntity<List<HiringDTO>> findAll() {
        log.info(" -- GET /hiring");
        return new ResponseEntity<>(hiringService.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HiringDTO> findById(Long id) {
        log.info(" -- GET /hiring/{}",id);
        return new ResponseEntity<>(hiringService.findById(id),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HiringDTO> saveHiring(Hiring hiring) {
        log.info(" -- POST /hiring {}",hiring.getName());
        return new ResponseEntity<>(hiringService.saveHiring(hiring),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HiringDTO> updateHiring(Hiring hiring) {
        log.info(" -- PUT /hiring {}",hiring.getName());
        return  new ResponseEntity<>(hiringService.updateHiring(hiring),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteHiring(Long id) {
        log.info(" -- DELETE /hiring {}",id);
        HiringDTO hiringDTO = hiringService.findById(id);
        if(hiringDTO == null){
            return ResponseEntity.noContent().build();
        }
        hiringService.deleteHiring(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
