package com.soprasteria.booking.model.dto;

import com.soprasteria.booking.model.entity.Need;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HiringDTO {
    private Long id;
    private String name;
    private Need need;
}
