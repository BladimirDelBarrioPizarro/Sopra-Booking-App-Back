package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.RecruiterDao;
import com.soprasteria.booking.service.RecruiterService;

public class RecruiterServiceImpl implements RecruiterService {

    private RecruiterDao recruiterDao;

    public RecruiterServiceImpl(RecruiterDao recruiterDao) {
        this.recruiterDao = recruiterDao;
    }
}
