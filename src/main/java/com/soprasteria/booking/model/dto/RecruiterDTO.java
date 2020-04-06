package com.soprasteria.booking.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecruiterDTO {
    private Long id;
    private String name;
    private String surname;
    private String initials;
}
