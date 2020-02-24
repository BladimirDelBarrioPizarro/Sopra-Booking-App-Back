package com.soprasteria.booking.model.dto;


import com.soprasteria.booking.model.entity.Hiringc;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
public class ChildDTO {
    private Long id;
    private String name;
    private String idOffer;
    private Integer year;
    private Integer creationWeek;
    private String code;
    private String month;
    private String idSeq;
    private String city;
    private String position;
    private String state;
    private String recruiter;
    private Timestamp openingDate;
    private Integer pipelDays;
    private Integer agency;
    private String client;
    private String hiringManage;
    private String profile;
    private String technology;
    private Integer vacancies;
    private String priority;
    private String pendingAccept;
    private Timestamp closingDate;
    private Integer openDays;
    private String closingReason;
    private Boolean active;
    private List<Hiringc> hiringc;

}
