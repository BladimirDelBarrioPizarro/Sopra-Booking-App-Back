package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.RecruiterController;
import com.soprasteria.booking.service.RecruiterService;

public class RecruiterControllerImpl implements RecruiterController {

    public RecruiterService recruiterService;

    public RecruiterControllerImpl(RecruiterService recruiterService) {
        this.recruiterService = recruiterService;
    }
}
