package com.lending.money.entity;

import com.lending.money.enums.BorrowerGender;
import com.lending.money.enums.BorrowerTitle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "BorrowerInfo")
public class BorrowerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer borInfoId;

    private String borName;
    private String borAddress;
    private Long borPhone;
    private String borEmail;
    private String borOccupation;

    @Enumerated(EnumType.STRING)
    private BorrowerGender borGender;

    @Enumerated(EnumType.STRING)
    private BorrowerTitle borTitle;

    @OneToOne
    @JoinColumn(name = "fk_bor_id", referencedColumnName = "borId")
    private Borrower borrower;
}
