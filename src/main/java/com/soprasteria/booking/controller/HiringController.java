package com.soprasteria.booking.controller;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1")
public interface HiringController {

    @GetMapping(path = "/hiring",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<CollectionModel<HiringDTO>> findAll();

    @GetMapping(path = "/hiring/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<HiringDTO>> findById(@PathVariable("id") Long id);

    @PostMapping(path = "/hiring",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> saveHiring(@RequestBody Hiring hiring);

    @PutMapping(path = "/hiring",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> updateHiring(@RequestBody Hiring hiring);

    @DeleteMapping(path = "/hiring/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Void> deleteHiring(@PathVariable("id") Long id);
}

