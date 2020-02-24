package com.soprasteria.booking.model.entity;


import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "need")
public class Need implements Serializable {
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
    private String agency;
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
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "hiring_need",
            joinColumns = @JoinColumn(name="need_id"),inverseJoinColumns = @JoinColumn(name="hiring_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"need_id","hiring_id"})})
    private List<Hiring> hiring;
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "need_child",
            joinColumns = @JoinColumn(name="need_id"),inverseJoinColumns = @JoinColumn(name="child_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"need_id","child_id"})})
    private List<Child> child;
}
