package com.soprasteria.booking.model.exceptions;

public class HandleExceptionChildFindById extends RuntimeException {
    public HandleExceptionChildFindById(Exception ex){
        super(ex.getMessage());
    }
}
