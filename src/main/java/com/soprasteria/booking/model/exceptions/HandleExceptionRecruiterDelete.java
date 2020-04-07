package com.soprasteria.booking.model.exceptions;

public class HandleExceptionRecruiterDelete extends RuntimeException {
    public HandleExceptionRecruiterDelete(Exception ex){
        super(ex.getMessage());
    }
}
