package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.HiringcController;
import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.entity.Hiringc;
import com.soprasteria.booking.service.HiringcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Objects;

@Slf4j
public class HiringcControllerImpl implements HiringcController {

    private HiringcService hiringcService;
    private EntityLinks entityLinks;

    public HiringcControllerImpl(HiringcService hiringcService, EntityLinks entityLinks) {
        this.hiringcService = hiringcService;
        this.entityLinks = entityLinks;
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
        EntityModel<HiringcDTO> entity = new EntityModel<>(hiringcService.saveHiringc(hiringc));
        entity.add(entityLinks.linkToItemResource(Hiringc.class, Objects.requireNonNull(hiringc.getId())));
        return new ResponseEntity(entity.getLinks(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<Links>> updateHiringc(Hiringc hiringc) {
        log.info(" -- PUT /hiringc {}", hiringc.getName());
        EntityModel<HiringcDTO> entity = new EntityModel<>(hiringcService.updateHiringc(hiringc));
        entity.add(entityLinks.linkToItemResource(Hiringc.class, Objects.requireNonNull(hiringc.getId())));
        return new ResponseEntity(entity.getLinks(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteHiringc(Long id) {
        log.info(" -- DELETE /hiringc {}",id);
        HiringcDTO hiringcDTO = hiringcService.findById(id);
        if(hiringcDTO == null){
            return ResponseEntity.noContent().build();
        }
        hiringcService.deleteHiringc(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}


