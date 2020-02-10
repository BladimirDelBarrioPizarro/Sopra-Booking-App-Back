package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.HiringController;
import com.soprasteria.booking.service.HiringService;

public class HiringControllerImpl implements HiringController {

    private HiringService hiringService;

    public HiringControllerImpl(HiringService hiringService) {
        this.hiringService = hiringService;
    }
}
