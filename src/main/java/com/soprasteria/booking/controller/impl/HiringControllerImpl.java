package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.HiringController;
import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Hiring;
import com.soprasteria.booking.model.entity.Need;
import com.soprasteria.booking.service.HiringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Slf4j
public class HiringControllerImpl implements HiringController {

    private HiringService hiringService;
    private final EntityLinks entityLinks;

    public HiringControllerImpl(HiringService hiringService,EntityLinks entityLinks) {
        this.hiringService = hiringService;
        this.entityLinks = entityLinks;
    }

    @Override
    public ResponseEntity<CollectionModel<NeedDTO>> findAll() {
        log.info(" -- GET /hiring");
        CollectionModel<HiringDTO> hirings = new CollectionModel(hiringService.findAll());
        hirings.add(entityLinks.linkToItemResource(Hiring.class, "/api/v1/hiring"));
        return new ResponseEntity(hirings, HttpStatus.OK);
    }
}
