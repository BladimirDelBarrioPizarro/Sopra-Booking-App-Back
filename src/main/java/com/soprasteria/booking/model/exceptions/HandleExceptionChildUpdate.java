package com.soprasteria.booking.model.exceptions;

public class HandleExceptionChildUpdate extends RuntimeException {
    public HandleExceptionChildUpdate(Exception ex){
        super(ex.getMessage());
    }
}
