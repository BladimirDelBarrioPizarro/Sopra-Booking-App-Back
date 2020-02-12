package com.soprasteria.booking.controller;

import com.soprasteria.booking.model.dto.NeedDTO;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public interface HiringController {

    @GetMapping(path = "/hiring",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<CollectionModel<NeedDTO>> findAll();



}
