package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.HiringcController;
import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.entity.Hiringc;
import com.soprasteria.booking.service.HiringcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;


@Slf4j
public class HiringcControllerImpl implements HiringcController {

    private HiringcService hiringcService;

    public HiringcControllerImpl(HiringcService hiringcService) {
        this.hiringcService = hiringcService;
    }

    @Override
    public ResponseEntity<List<HiringcDTO>> findAll() {
        log.info(" -- GET /hiringc");
        return new ResponseEntity<>(hiringcService.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HiringcDTO> findById(Long id) {
        log.info(" -- GET /hiringc/{}", id);
        return new ResponseEntity<>(hiringcService.findById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<Links>> saveHiring(Hiringc hiringc) {
        log.info(" -- POST /hiringc {}", hiringc.getName());
        return new ResponseEntity(hiringcService.saveHiringc(hiringc), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<Links>> updateHiringc(Hiringc hiringc) {
        log.info(" -- PUT /hiringc {}", hiringc.getName());
        return new ResponseEntity(hiringcService.updateHiringc(hiringc), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteHiringc(Long id) {
        log.info(" -- DELETE /hiringc {}",id);
        HiringcDTO hiringcDTO = hiringcService.findById(id);
        if(hiringcDTO == null){
            return ResponseEntity.noContent().build();
        }
        hiringcService.deleteHiringc(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}


