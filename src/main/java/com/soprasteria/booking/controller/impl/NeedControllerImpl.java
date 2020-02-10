package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.NeedController;
import com.soprasteria.booking.service.NeedService;

public class NeedControllerImpl implements NeedController {

    private NeedService needService;

    public NeedControllerImpl(NeedService needService) {
        this.needService = needService;
    }
}
