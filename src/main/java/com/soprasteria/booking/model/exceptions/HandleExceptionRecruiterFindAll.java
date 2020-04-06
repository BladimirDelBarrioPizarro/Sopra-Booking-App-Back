package com.soprasteria.booking.model.exceptions;

public class HandleExceptionRecruiterFindAll extends RuntimeException {
    public HandleExceptionRecruiterFindAll(Exception ex){
        super(ex.getMessage());
    }
}
