package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.NeedDao;
import com.soprasteria.booking.service.NeedService;

public class NeedServiceImpl implements NeedService {

    private NeedDao needDao;

    public NeedServiceImpl(NeedDao needDao) {
        this.needDao = needDao;
    }
}
