package com.soprasteria.booking.model.exceptions;

public class HandleExceptionNeedFindAll extends RuntimeException {
    public HandleExceptionNeedFindAll(Exception ex){
        super(ex.getMessage());
    }
}
