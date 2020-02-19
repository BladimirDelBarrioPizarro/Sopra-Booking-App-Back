package com.soprasteria.booking.model.exceptions;

public class HandleExceptionNeedFindById extends RuntimeException {
    public HandleExceptionNeedFindById(Exception ex){
        super(ex.getMessage());
    }
}
