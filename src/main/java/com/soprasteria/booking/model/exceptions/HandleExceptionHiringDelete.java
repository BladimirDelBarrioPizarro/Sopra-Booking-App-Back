package com.soprasteria.booking.model.exceptions;

public class HandleExceptionHiringDelete extends RuntimeException {
    public HandleExceptionHiringDelete(Exception ex){
        super(ex.getMessage());
    }
}
