package com.soprasteria.booking.model.messages;

import lombok.Getter;

@Getter
public enum ErrorMessages {

    ERROR_HANDLE_NEED_FIND_ALL(101,"Error in the extraction of needs"),
    ERROR_HANDLE_NEED_FIND_BYID(102,"Error in the extraction of the selected need"),
    ERROR_HANDLE_NEED_SAVE(103,"Error saving the selected need"),
    ERROR_HANDLE_NEED_UPDATE(104,"Error modifying the selected need"),
    ERROR_HANDLE_NEED_DELETE(105,"Error deleting the selected need");

    private Integer code;
    private String message;


    ErrorMessages(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
