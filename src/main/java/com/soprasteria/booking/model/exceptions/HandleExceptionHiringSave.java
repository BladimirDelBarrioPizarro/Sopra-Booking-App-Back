package com.soprasteria.booking.model.exceptions;

public class HandleExceptionHiringSave extends RuntimeException {
    public HandleExceptionHiringSave(Exception ex){
        super(ex.getMessage());
    }
}
