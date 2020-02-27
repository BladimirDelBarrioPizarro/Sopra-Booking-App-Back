package com.soprasteria.booking.controller;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public interface HiringController {

    @GetMapping(path = "/hiring",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<List<HiringDTO>> findAll();

    @GetMapping(path = "/hiring/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<HiringDTO> findById(@PathVariable("id") Long id);

    @PostMapping(path = "/hiring",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> saveHiring(@RequestBody Hiring hiring);

    @PutMapping(path = "/hiring",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<HiringDTO> updateHiring(@RequestBody Hiring hiring);

    @DeleteMapping(path = "/hiring/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Void> deleteHiring(@PathVariable("id") Long id);
}

