package com.soprasteria.booking.service.impl;

import com.soprasteria.booking.dao.ChildDao;
import com.soprasteria.booking.model.entity.Child;
import com.soprasteria.booking.service.ChildService;

import java.util.List;

public class ChildServiceImpl implements ChildService {

    private ChildDao childDao;

    public ChildServiceImpl(ChildDao childDao) {
        this.childDao = childDao;
    }

    @Override
    public List<Child> findAll() {
        return childDao.findAll();
    }
}
