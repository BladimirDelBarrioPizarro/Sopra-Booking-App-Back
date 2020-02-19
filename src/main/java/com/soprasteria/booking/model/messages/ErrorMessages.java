package com.soprasteria.booking.model.messages;

import lombok.Getter;

@Getter
public enum ErrorMessages {

    ERROR_HANDLE_NEED_FIND_ALL(101,"Error in the extraction of needs"),
    ERROR_HANDLE_NEED_FIND_BYID(102,"Error in the extraction of the selected need"),
    ERROR_HANDLE_NEED_SAVE(103,"Error saving the selected need"),
    ERROR_HANDLE_NEED_UPDATE(104,"Error modifying the selected need"),
    ERROR_HANDLE_NEED_DELETE(105,"Error deleting the selected need"),

    ERROR_HANDLE_HIRING_FIND_ALL(106,"Error in the extraction of hirings"),
    ERROR_HANDLE_HIRING_FIND_BYID(107,"Error in the extraction of the selected hiring"),
    ERROR_HANDLE_HIRING_SAVE(108,"Error saving the selected hiring"),
    ERROR_HANDLE_HIRING_UPDATE(109,"Error modifying the selected hiring"),
    ERROR_HANDLE_HIRING_DELETE(110,"Error deleting the selected hiring"),

    ERROR_HANDLE_CHILD_FIND_ALL(111,"Error in the extraction of childs"),
    ERROR_HANDLE_CHILD_FIND_BYID(112,"Error in the extraction of the selected child"),
    ERROR_HANDLE_CHILD_SAVE(113,"Error saving the selected child");

    private Integer code;
    private String message;


    ErrorMessages(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
