package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.NeedController;
import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Need;
import com.soprasteria.booking.service.NeedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Objects;


@Slf4j
public class NeedControllerImpl implements NeedController {

    private NeedService needService;
    private final EntityLinks entityLinks;

    public NeedControllerImpl(NeedService needService,EntityLinks entityLinks) {
        this.needService = needService;
        this.entityLinks = entityLinks;
    }

    public ResponseEntity<List<NeedDTO>> findAll(Pageable pageable) {
        log.info(" -- GET /needs");
        return new ResponseEntity<>(needService.findAll(pageable), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<NeedDTO> findById(Long id) {
        log.info(" -- GET /needs/{}",id);
        return new ResponseEntity<>(needService.findById(id),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<NeedDTO> saveNeed(Need need) {
        log.info(" -- POST /needs {}",need.getName());
        return new ResponseEntity(needService.saveNeed(need),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<Links>> updateNeed(Need need) {
        log.info(" -- PUT /needs {}",need.getName());
        EntityModel<NeedDTO> entity = new EntityModel<>(needService.updateNeed(need));
        entity.add(entityLinks.linkToItemResource(Need.class, Objects.requireNonNull(need.getId())));
        return new ResponseEntity(entity.getLinks(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteNeed(Long id) {
        log.info(" -- DELETE /needs {}",id);
        NeedDTO needDTO = needService.findById(id);
        if(needDTO==null){
            return ResponseEntity.noContent().build();
        }
        needService.deleteNeed(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
