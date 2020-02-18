package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.controller.HiringcController;
import com.soprasteria.booking.service.HiringcService;
import org.springframework.hateoas.server.EntityLinks;

public class HiringcControllerImpl implements HiringcController {

    private HiringcService hiringcService;
    private EntityLinks entityLinks;

    public HiringcControllerImpl(HiringcService hiringcService, EntityLinks entityLinks) {
        this.hiringcService = hiringcService;
        this.entityLinks = entityLinks;
    }
}
