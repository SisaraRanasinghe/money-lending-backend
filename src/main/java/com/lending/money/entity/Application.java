package com.lending.money.entity;


import com.lending.money.enums.ADTType;
import com.lending.money.enums.ApplicationStatus;
import com.lending.money.enums.TemplateType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appId;
    private String aaNum;
    private String appNumber;
    private String branch;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus appStatus;

    @Enumerated(EnumType.STRING)
    private ADTType adtType;

    @Enumerated(EnumType.STRING)
    private TemplateType templateType;

    private String systemDecision;
    private LocalDate appCreatedDate;

    @OneToMany(mappedBy = "application", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ApplicationFacility> applicationFacilities;

    @ManyToOne
    @JoinColumn(name = "fk_bor_id", referencedColumnName = "borId")
    private Borrower borrower;

}