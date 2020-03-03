package com.soprasteria.booking.controller;

import com.soprasteria.booking.model.dto.ChildDTO;

import com.soprasteria.booking.model.entity.Child;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public interface ChildController {

    @GetMapping(path = "/childs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<List<ChildDTO>> findAll();

    @GetMapping(path = "/childs/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<ChildDTO> findById(@PathVariable("id") Long id);

    @PostMapping(path = "/childs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<ChildDTO> saveChild(@RequestBody Child child);

    @PutMapping(path = "/childs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<ChildDTO> updateChild(@RequestBody Child child);

    @DeleteMapping(path = "/childs/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Void> deleteChild(@PathVariable("id") Long id);
}
