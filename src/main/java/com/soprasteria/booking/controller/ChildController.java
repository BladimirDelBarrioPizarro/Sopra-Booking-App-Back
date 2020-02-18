package com.soprasteria.booking.controller;

import com.soprasteria.booking.model.dto.ChildDTO;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public interface ChildController {

    @GetMapping(path = "/childs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<CollectionModel<ChildDTO>> findAll();

    @GetMapping(path = "/childs/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<ChildDTO>> findById(@PathVariable("id") Long id);
}


/*
*  @GetMapping(path = "/needs/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<NeedDTO>> findById(@PathVariable("id") Long id);

    @PostMapping(path = "/needs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> saveNeed(@RequestBody Need need);

    @PutMapping(path = "/needs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> updateNeed(@RequestBody Need need);

    @DeleteMapping( path = "/needs/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Void> deleteNeed(@PathVariable("id") Long id);
*
*
* */