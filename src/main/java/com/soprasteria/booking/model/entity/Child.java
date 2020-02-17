package com.soprasteria.booking.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
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
    @Column(name = "name")
    private String name;
    @Column(name = "active")
    private Boolean active;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "hiringc_child",
            joinColumns = @JoinColumn(name="child_id"),inverseJoinColumns = @JoinColumn(name="hiringc_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"child_id","hiringc_id"})})
    private List<Hiringc> hiringc;
}
