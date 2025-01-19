package com.lending.money.entity;

import com.lending.money.enums.ParameterType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Parameter")
public class Parameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paraId;
    private String paraName;
    private String paraDesc;
    private String paraCode;
    private Boolean paraStatus;
    private String paraCreatedUser;
    private LocalDate paraCreatedOn;

    @Enumerated(EnumType.STRING)
    private ParameterType parameterType;
}
