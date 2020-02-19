package com.soprasteria.booking.model.exceptions;

public class HandleExceptionChildFindAll extends RuntimeException {
    public HandleExceptionChildFindAll(Exception ex){
        super(ex.getMessage());
    }
}
