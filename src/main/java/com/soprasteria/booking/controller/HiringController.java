package com.soprasteria.booking.controller;

import com.soprasteria.booking.model.dto.HiringDTO;
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
public interface HiringController {

    @GetMapping(path = "/hiring",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<CollectionModel<HiringDTO>> findAll();

    @GetMapping(path = "/hiring/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<HiringDTO>> findById(@PathVariable("id") Long id);



}
