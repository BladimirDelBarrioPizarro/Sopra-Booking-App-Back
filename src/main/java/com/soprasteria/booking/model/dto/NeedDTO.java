package com.soprasteria.booking.model.dto;

import com.soprasteria.booking.model.entity.Hiring;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class NeedDTO {
    private Long id;
    private String name;
    private Boolean active;
    private List<Hiring> hiring;
}
