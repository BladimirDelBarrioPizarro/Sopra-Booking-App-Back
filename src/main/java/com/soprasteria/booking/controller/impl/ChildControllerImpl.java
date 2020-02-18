package com.soprasteria.booking.controller.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.soprasteria.booking.controller.ChildController;
import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;
import com.soprasteria.booking.service.ChildService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

@Slf4j
public class ChildControllerImpl implements ChildController {

    private ChildService childService;
    private EntityLinks entityLinks;

    public ChildControllerImpl(ChildService childService,EntityLinks entityLinks){
        this.childService = childService;
        this.entityLinks = entityLinks;
    }

    @Override
    public ResponseEntity<CollectionModel<ChildDTO>> findAll() {
        log.info(" -- GET /childs");
        CollectionModel<ChildDTO> entity = new CollectionModel(childService.findAll());
        entity.add(entityLinks.linkToItemResource(Child.class, "/api/v1/childs"));
        return new ResponseEntity(entity, HttpStatus.OK);
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Override
    public ResponseEntity<EntityModel<ChildDTO>> findById(Long id) {
        log.info(" -- GET /childs/{}",id);
        EntityModel<ChildDTO> entity = new EntityModel<>(childService.findById(id));
        entity.add(entityLinks.linkToItemResource(Child.class, Objects.requireNonNull(entity.getContent()).getId()));
        return new ResponseEntity<>(entity,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<Links>> saveChild(Child child) {
        log.info(" -- POST /child {}",child.getName());
        EntityModel<ChildDTO> entity = new EntityModel<>(childService.saveChild(child));
        entity.add(entityLinks.linkToItemResource(Child.class, Objects.requireNonNull(entity.getContent().getId())));
        return new ResponseEntity(entity.getLinks(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityModel<Links>> updateChild(Child child) {
        log.info(" -- PUT /childs {}",child.getName());
        EntityModel<ChildDTO> entity = new EntityModel<>(childService.updateChild(child));
        entity.add(entityLinks.linkToItemResource(Child.class, Objects.requireNonNull(child.getId())));
        return new ResponseEntity(entity.getLinks(),HttpStatus.OK);
    }
}

