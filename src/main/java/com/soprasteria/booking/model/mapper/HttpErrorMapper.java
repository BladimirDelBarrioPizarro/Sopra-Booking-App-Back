package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.HttpErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.Timestamp;

public class HttpErrorMapper {

    public static ResponseEntity<HttpErrorDTO> buildHttpErrorDTO(Integer code, HttpStatus internalServerError, String contextPath, String message, String method, String cause, Timestamp timestamp) {
        return new ResponseEntity<>(HttpErrorDTO.builder()
                .code(code)
                .statusText(internalServerError.toString())
                .url(contextPath)
                .message(message)
                .method(method)
                .cause(cause)
                .date(timestamp)
                .build(),HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
