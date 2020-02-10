package com.soprasteria.booking.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hiring")
public class Hiring implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "active")
    private Boolean active;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "hiring_nedd",
            joinColumns = @JoinColumn(name="hiring_id"),inverseJoinColumns = @JoinColumn(name="need_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"hiring_id","need_id"})})
    private Need need;
}
