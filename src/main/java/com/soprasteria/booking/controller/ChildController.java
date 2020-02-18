package com.soprasteria.booking.controller;

import com.soprasteria.booking.model.dto.ChildDTO;

import com.soprasteria.booking.model.entity.Child;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public interface ChildController {

    @GetMapping(path = "/childs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<CollectionModel<ChildDTO>> findAll();

    @GetMapping(path = "/childs/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<ChildDTO>> findById(@PathVariable("id") Long id);

    @PostMapping(path = "/childs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> saveChild(@RequestBody Child child);
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