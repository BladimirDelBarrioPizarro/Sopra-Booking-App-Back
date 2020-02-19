package com.soprasteria.booking.model.exceptions;

public class HandleExceptionNeedDelete extends RuntimeException {
    public HandleExceptionNeedDelete(Exception ex){
        super(ex.getMessage());
    }
}
