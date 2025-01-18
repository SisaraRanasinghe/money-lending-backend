package com.lending.money.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ApplicationFacility")
public class ApplicationFacility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_fac_id")
    private Integer appFacId;

    @ManyToOne
    @JoinColumn(name = "fk_fac_id", nullable = false)
    private Facility facility;

    @ManyToOne
    @JoinColumn(name = "fk_app_id", nullable = false)
    private Application application;
}
