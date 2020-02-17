package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.ChildController;
import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Child;
import com.soprasteria.booking.model.entity.Need;
import com.soprasteria.booking.service.ChildService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ChildControllerImpl implements ChildController {

    private ChildService childService;
    private EntityLinks entityLinks;

    public ChildControllerImpl(ChildService childService,EntityLinks entityLinks){
        this.childService = childService;
        this.entityLinks = entityLinks;
    }

    @Override
    public ResponseEntity<CollectionModel<Child>> findAll() {
        CollectionModel<Child> childs = new CollectionModel(childService.findAll());
        childs.add(entityLinks.linkToItemResource(Child.class, "/api/v1/childs"));
        return new ResponseEntity(childs, HttpStatus.OK);
    }
}

