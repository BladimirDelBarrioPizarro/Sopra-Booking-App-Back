package com.soprasteria.booking.controller;


import com.soprasteria.booking.model.dto.RecruiterDTO;
import com.soprasteria.booking.model.entity.Recruiter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public interface RecruiterController {

    @GetMapping(path = "/recruiter",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<List<RecruiterDTO>> findAll();

    @GetMapping(path = "/recruiter/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<RecruiterDTO> findById(@PathVariable("id") Long id);

    @PostMapping(path = "/recruiter",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<RecruiterDTO> saveRecruiter(@RequestBody Recruiter recruiter);

    @DeleteMapping(path = "/recruiter/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Void> deleteRecruiter(@PathVariable("id") Long id);
}
