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
    private final EntityLinks entityLinks;

    public HiringControllerImpl(HiringService hiringService,EntityLinks entityLinks) {
        this.hiringService = hiringService;
        this.entityLinks = entityLinks;
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
    public ResponseEntity<EntityModel<Links>> saveHiring(Hiring hiring) {
        log.info(" -- POST /hiring {}",hiring.getName());
        EntityModel<HiringDTO> entity = new EntityModel<>(hiringService.saveHiring(hiring));
        entity.add(entityLinks.linkToItemResource(Hiring.class,Objects.requireNonNull(hiring.getId())));
        return new ResponseEntity(entity.getLinks(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<Links>> updateHiring(Hiring hiring) {
        log.info(" -- PUT /hiring {}",hiring.getName());
        EntityModel<HiringDTO> entity = new EntityModel<>(hiringService.updateHiring(hiring));
        entity.add(entityLinks.linkToItemResource(Hiring.class,Objects.requireNonNull(hiring.getId())));
        return  new ResponseEntity(entity.getLinks(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteHiring(Long id) {
        log.info(" -- DELETE /hiring {}",id);
        HiringDTO hiringDTO = hiringService.findById(id);
        if(hiringDTO == null){
            return ResponseEntity.noContent().build();
        }
        hiringService.deleteHiring(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
