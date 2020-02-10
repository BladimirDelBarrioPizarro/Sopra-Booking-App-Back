package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.HiringDao;
import com.soprasteria.booking.service.HiringService;

public class HiringServiceImpl implements HiringService {

    private HiringDao hiringDao;

    public HiringServiceImpl(HiringDao hiringDao) {
        this.hiringDao = hiringDao;
    }
}
