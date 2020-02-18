package com.soprasteria.booking.controller;


import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.entity.Hiringc;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public interface HiringcController {

    @GetMapping(path = "/hiringc",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<CollectionModel<HiringcDTO>> findAll();

    @GetMapping(path = "/hiringc/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<HiringcDTO>> findById(@PathVariable("id") Long id);

    @PostMapping(path = "/hiringc",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> saveHiring(@RequestBody Hiringc hiringc);

    @PutMapping(path = "/hiringc",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> updateHiringc(@RequestBody Hiringc hiringc);

    @DeleteMapping(path = "/hiringc/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Void> deleteHiringc(@PathVariable("id") Long id);
}











