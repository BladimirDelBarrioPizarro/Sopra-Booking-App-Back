package com.soprasteria.booking.controller.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.soprasteria.booking.controller.ChildController;
import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;
import com.soprasteria.booking.service.ChildService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
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
        CollectionModel<ChildDTO> childs = new CollectionModel(childService.findAll());
        childs.add(entityLinks.linkToItemResource(Child.class, "/api/v1/childs"));
        return new ResponseEntity(childs, HttpStatus.OK);
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Override
    public ResponseEntity<EntityModel<ChildDTO>> findById(Long id) {
        log.info(" -- GET /childs/{}",id);
        EntityModel<ChildDTO> childs = new EntityModel<>(childService.findById(id));
        childs.add(entityLinks.linkToItemResource(Child.class, Objects.requireNonNull(childs.getContent()).getId()));
        return new ResponseEntity<>(childs,HttpStatus.OK);
    }
}
