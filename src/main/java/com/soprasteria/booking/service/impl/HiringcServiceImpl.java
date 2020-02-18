package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.HiringcDao;
import com.soprasteria.booking.service.HiringcService;

public class HiringcServiceImpl implements HiringcService {

    private HiringcDao hiringcDao;

    public HiringcServiceImpl(HiringcDao hiringcDao) {
        this.hiringcDao = hiringcDao;
    }
}
