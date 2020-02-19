package com.soprasteria.booking.model.exceptions;

public class HandleExceptionNeedUpdate extends RuntimeException {
    public HandleExceptionNeedUpdate(Exception ex){
        super(ex.getMessage());
    }
}
