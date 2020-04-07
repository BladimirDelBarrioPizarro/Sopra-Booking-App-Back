package com.soprasteria.booking.model.exceptions;

public class HandleExceptionRecruiterSave extends RuntimeException {
    public HandleExceptionRecruiterSave(Exception ex){
        super(ex.getMessage());
    }
}
