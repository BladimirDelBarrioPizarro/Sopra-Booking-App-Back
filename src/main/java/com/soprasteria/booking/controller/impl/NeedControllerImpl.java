package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.NeedController;
import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Need;
import com.soprasteria.booking.service.NeedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;

import java.util.Objects;


@Slf4j
public class NeedControllerImpl implements NeedController {

    private NeedService needService;
    private final EntityLinks entityLinks;

    public NeedControllerImpl(NeedService needService,EntityLinks entityLinks) {
        this.needService = needService;
        this.entityLinks = entityLinks;
    }

    public ResponseEntity<CollectionModel<NeedDTO>> findAll(Pageable pageable) {
        log.info(" -- GET /needs");
        CollectionModel<NeedDTO> needs = new CollectionModel(needService.findAll(pageable));
        needs.add(entityLinks.linkToItemResource(Need.class, "/api/v1/needs"));
        return new ResponseEntity<>(needs, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<NeedDTO>> findById(Long id) {
        log.info(" -- GET /needs/{}",id);
        EntityModel<NeedDTO> need = new EntityModel<>(needService.findById(id));
        need.add(entityLinks.linkToItemResource(Need.class, Objects.requireNonNull(need.getContent()).getId()));
        return new ResponseEntity<>(need,HttpStatus.OK);
    }
}
