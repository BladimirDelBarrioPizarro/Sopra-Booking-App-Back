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

    @Override
    public ResponseEntity<EntityModel<Links>> saveNeed(Need need) {
        log.info(" -- POST /needs {}",need.getName());
        EntityModel<NeedDTO> entity = new EntityModel<>(needService.saveNeed(need));
        entity.add(entityLinks.linkToItemResource(Need.class, Objects.requireNonNull(need.getId())));
        Links links = entity.getLinks();
        return new ResponseEntity(links,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<Links>> updateNeed(Need need) {
        log.info(" -- PUT /needs {}",need.getName());
        EntityModel<NeedDTO> entity = new EntityModel<>(needService.updateNeed(need));
        entity.add(entityLinks.linkToItemResource(Need.class, Objects.requireNonNull(need.getId())));
        Links links = entity.getLinks();
        return new ResponseEntity(links,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteNeed(Long id) {
        NeedDTO needDTO = needService.findById(id);
        if(needDTO==null){
            return ResponseEntity.noContent().build();
        }
        else{
            needService.deleteNeed(id);
            return new ResponseEntity(HttpStatus.OK);
        }
    }


}
