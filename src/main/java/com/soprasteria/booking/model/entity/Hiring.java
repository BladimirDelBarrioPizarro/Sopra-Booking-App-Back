package com.soprasteria.booking.model.entity;



import lombok.*;
import javax.persistence.*;
import java.io.Serializable;



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
    @Column(name = "name")
    private String name;
    @Column(name = "active")
    private Boolean active;
}
