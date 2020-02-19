package com.soprasteria.booking.model.exceptions;

public class HandleExceptionNeedSave extends RuntimeException {
    public HandleExceptionNeedSave(Exception ex){
        super(ex.getMessage());
    }
}

