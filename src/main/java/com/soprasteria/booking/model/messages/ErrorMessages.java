package com.soprasteria.booking.model.messages;

import lombok.Getter;

@Getter
public enum ErrorMessages {

    ERROR_HANDLE_NEED_FIND_ALL(101,"Error in the extraction of needs");

    private Integer code;
    private String message;


    ErrorMessages(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
