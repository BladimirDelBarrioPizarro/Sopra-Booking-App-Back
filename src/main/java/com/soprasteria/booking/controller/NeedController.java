package com.soprasteria.booking.controller;


import com.soprasteria.booking.model.dto.NeedDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
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
public interface NeedController {

    @GetMapping(path = "/needs",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<CollectionModel<NeedDTO>> findAll(@Param("pageable") Pageable pageable);

    @GetMapping(path = "/needs/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<EntityModel<NeedDTO>> findById(@PathVariable("id") Long id);
}
