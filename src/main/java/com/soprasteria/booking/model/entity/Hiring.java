package com.soprasteria.booking.model.entity;



import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hiring")
public class Hiring implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String indefiniteContract;
    private String category;
    private String offerValidation;
    private Float offer1;
    private Float counterOffer2;
    private String variable;
    private String offerStatus;
    private String reasonRejectionOffer;
    private String validated;
    private String employeeWeb;
    private String observations;
    private String resourceProfitability;
    private Float directSelection;
    private Float outSourcing;
    private Boolean active;
}

