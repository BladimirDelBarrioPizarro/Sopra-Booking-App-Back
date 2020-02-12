package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.HiringController;
import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Hiring;
import com.soprasteria.booking.model.entity.Need;
import com.soprasteria.booking.service.HiringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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
    public ResponseEntity<CollectionModel<HiringDTO>> findAll() {
        log.info(" -- GET /hiring");
        CollectionModel<HiringDTO> hirings = new CollectionModel(hiringService.findAll());
        hirings.add(entityLinks.linkToItemResource(Hiring.class, "/api/v1/hiring"));
        return new ResponseEntity(hirings, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<HiringDTO>> findById(Long id) {
        log.info(" -- GET /hiring/{}",id);
        EntityModel<HiringDTO> hiring = new EntityModel<>(hiringService.findById(id));
        hiring.add(entityLinks.linkToItemResource(Hiring.class, Objects.requireNonNull(hiring.getContent().getId())));
        return new ResponseEntity<>(hiring,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<Links>> saveHiring(Hiring hiring) {
        log.info(" -- POST /needs {}",hiring.getName());
        EntityModel<HiringDTO> entity = new EntityModel<>(hiringService.saveHiring(hiring));
        entity.add(entityLinks.linkToItemResource(Hiring.class,Objects.requireNonNull(hiring.getId())));
        return new ResponseEntity(entity.getLinks(),HttpStatus.OK);
    }
}
