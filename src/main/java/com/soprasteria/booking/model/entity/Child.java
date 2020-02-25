package com.soprasteria.booking.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "child")
public class Child implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String subtechnology;
    private Integer vacancies;
    private String priority;
    private String pendingAccept;
    private Timestamp closingDate;
    private Integer openDays;
    private String closingReason;
    private Boolean active;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "hiringc_child",
            joinColumns = @JoinColumn(name="child_id"),inverseJoinColumns = @JoinColumn(name="hiringc_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"child_id","hiringc_id"})})
    private List<Hiringc> hiringc;
}
