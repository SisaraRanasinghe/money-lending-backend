package com.lending.money.entity;

import com.lending.money.enums.FacilityName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer facId;
    private String facCode;
    private Boolean facStatus;

    @Enumerated(EnumType.STRING)
    private FacilityName facName;
}
