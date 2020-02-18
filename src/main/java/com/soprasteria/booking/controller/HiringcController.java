package com.soprasteria.booking.controller;


import com.soprasteria.booking.model.dto.HiringcDTO;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public interface HiringcController {

    @GetMapping(path = "/hiringc",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<CollectionModel<HiringcDTO>> findAll();
}




/*
*

    @GetMapping(path = "/hiring/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<HiringDTO>> findById(@PathVariable("id") Long id);

    @PostMapping(path = "/hiring",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> saveHiring(@RequestBody Hiring hiring);

    @PutMapping(path = "/hiring",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> updateHiring(@RequestBody Hiring hiring);

    @DeleteMapping(path = "/hiring/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Void> deleteHiring(@PathVariable("id") Long id);
*
*
*
*
*
*
* */