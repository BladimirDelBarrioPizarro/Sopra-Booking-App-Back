package com.soprasteria.booking.model.dto;

import lombok.Builder;
import lombok.Data;
import java.sql.Timestamp;

@Data
@Builder
public class HttpErrorDTO {
    private Integer code;
    private String statusText;
    private String url;
    private String message;
    private String method;
    private Throwable cause;
    private Timestamp date;
}
