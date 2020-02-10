package com.soprasteria.booking.model.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
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
    @Column(name = "name")
    private String name;
    @Column(name = "active")
    private Boolean active;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "hiring_need",
            joinColumns = @JoinColumn(name="need_id"),inverseJoinColumns = @JoinColumn(name="hiring_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"need_id","hiring_id"})})
    private List<Hiring> hiring;
}
