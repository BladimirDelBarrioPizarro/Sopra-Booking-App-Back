package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.HiringcController;
import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.entity.Hiringc;
import com.soprasteria.booking.service.HiringcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Slf4j
public class HiringcControllerImpl implements HiringcController {

    private HiringcService hiringcService;
    private EntityLinks entityLinks;

    public HiringcControllerImpl(HiringcService hiringcService, EntityLinks entityLinks) {
        this.hiringcService = hiringcService;
        this.entityLinks = entityLinks;
    }

    @Override
    public ResponseEntity<CollectionModel<HiringcDTO>> findAll() {
        log.info(" -- GET /hiringc");
        CollectionModel<HiringcDTO> entity = new CollectionModel(hiringcService.findAll());
        entity.add(entityLinks.linkToItemResource(Hiringc.class, "/api/v1/hiringc"));
        return new ResponseEntity(entity, HttpStatus.OK);
    }
}
