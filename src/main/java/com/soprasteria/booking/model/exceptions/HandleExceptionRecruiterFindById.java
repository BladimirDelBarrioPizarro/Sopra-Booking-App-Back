package com.soprasteria.booking.model.exceptions;

public class HandleExceptionRecruiterFindById extends RuntimeException {
    public HandleExceptionRecruiterFindById(Exception ex){
        super(ex.getMessage());
    }
}
