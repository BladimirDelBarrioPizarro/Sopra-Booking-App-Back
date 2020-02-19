package com.soprasteria.booking.model.exceptions;

public class HandleExceptionChildSave extends RuntimeException {
    public HandleExceptionChildSave(Exception ex){
        super(ex.getMessage());
    }
}
