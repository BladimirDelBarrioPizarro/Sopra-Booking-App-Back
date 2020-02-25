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

import java.util.List;
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
    public ResponseEntity<List<ChildDTO>> findAll() {
        log.info(" -- GET /childs");
        return new ResponseEntity<>(childService.findAll(), HttpStatus.OK);
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Override
    public ResponseEntity<ChildDTO> findById(Long id) {
        log.info(" -- GET /childs/{}",id);
        return new ResponseEntity<>(childService.findById(id),HttpStatus.OK);
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

    @Override
    public ResponseEntity<Void> deleteChild(Long id) {
        log.info(" -- DELETE /childs {}",id);
        ChildDTO childDTO = childService.findById(id);
        if(childDTO == null){
            return ResponseEntity.noContent().build();
        }
        childService.deleteChild(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
