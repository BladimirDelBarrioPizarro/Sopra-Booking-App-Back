package com.soprasteria.booking.model.exceptions;

public class HandleExceptionHiringFindAll extends RuntimeException {
    public HandleExceptionHiringFindAll(Exception ex){
        super(ex.getMessage());
    }
}
