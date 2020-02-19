package com.soprasteria.booking.model.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class HiringcDTO {
    private Long id;
    private Timestamp registrationDate;
    private String companyHires;
    private String incorporationModality;
    private String requestTeam;
    private String teamOffer;
    private String recruiter;
    private String recruiterSource;
    private String marketStall;
    private String ambit;
    private String agency;
    private String client;
    private String name;
    private Timestamp incorporationDate;
    private String exceptions;
    private String indefiniteContact;
    private String category;
    private String offerValidation;
    private Integer offer1;
    private Integer counterOffer2;
    private String reasonRejectionOffer;
    private String validated;
    private String employeeWeb;
    private String observations;
    private String resourceProfitability;
    private String directSelection;
    private String outSourcing;
    private Boolean active;
}
