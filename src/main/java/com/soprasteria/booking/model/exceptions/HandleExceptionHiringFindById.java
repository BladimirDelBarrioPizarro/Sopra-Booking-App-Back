package com.soprasteria.booking.model.exceptions;

public class HandleExceptionHiringFindById extends RuntimeException {
    public HandleExceptionHiringFindById(Exception ex){
        super(ex.getMessage());
    }
}
