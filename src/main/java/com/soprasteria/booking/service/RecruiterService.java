package com.soprasteria.booking.service;

import com.soprasteria.booking.model.dto.RecruiterDTO;
import com.soprasteria.booking.model.entity.Recruiter;

import java.util.List;

public interface RecruiterService {
    List<RecruiterDTO> findAll();
    RecruiterDTO saveRecruiter(Recruiter recruiter);
}
