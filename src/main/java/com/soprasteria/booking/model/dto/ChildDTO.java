package com.soprasteria.booking.model.dto;


import com.soprasteria.booking.model.entity.Hiringc;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ChildDTO {
    private Long id;
    private String name;
    private Boolean active;
    private List<Hiringc> hiring;

}
