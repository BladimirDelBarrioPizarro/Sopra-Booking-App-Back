package com.soprasteria.booking.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NeedDTO {
    private Long id;
    private String name;
    private Boolean active;
}
