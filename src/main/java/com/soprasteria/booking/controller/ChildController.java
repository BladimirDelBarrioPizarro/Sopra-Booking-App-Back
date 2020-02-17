package com.soprasteria.booking.controller;

import com.soprasteria.booking.model.dto.NeedDTO;

import com.soprasteria.booking.model.entity.Child;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public interface ChildController {

    @GetMapping(path = "/childs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<CollectionModel<Child>> findAll();
}
