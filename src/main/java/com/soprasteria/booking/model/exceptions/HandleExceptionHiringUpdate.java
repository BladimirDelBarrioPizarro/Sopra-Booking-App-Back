package com.soprasteria.booking.model.exceptions;

public class HandleExceptionHiringUpdate extends RuntimeException {
    public HandleExceptionHiringUpdate(Exception ex){
        super(ex.getMessage());
    }
}
