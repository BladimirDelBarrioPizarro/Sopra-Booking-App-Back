package com.soprasteria.booking.controller;


import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Need;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public interface NeedController {

    @GetMapping(path = "/needs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<List<NeedDTO>> findAll(@Param("pageable") Pageable pageable);

    @GetMapping(path = "/needs/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<NeedDTO> findById(@PathVariable("id") Long id);

    @PostMapping(path = "/needs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<NeedDTO> saveNeed(@RequestBody Need need);

    @PutMapping(path = "/needs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<Links>> updateNeed(@RequestBody Need need);

    @DeleteMapping( path = "/needs/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Void> deleteNeed(@PathVariable("id") Long id);
}
