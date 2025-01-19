package com.lending.money.entity;

import com.lending.money.enums.BorrowerType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Borrower")
public class Borrower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer borId;

    private String CIF;

    @Enumerated(EnumType.STRING)
    private BorrowerType borType;

    @ManyToOne
    @JoinColumn(name = "fk_app_id", referencedColumnName = "appId")
    private Application application;
}
