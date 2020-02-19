package com.soprasteria.booking.model.exceptions;

public class HandleExceptionChildDelete extends RuntimeException {
    public HandleExceptionChildDelete(Exception ex){
        super(ex.getMessage());
    }
}
