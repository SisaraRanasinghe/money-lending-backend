package com.lending.money.entity;

import com.lending.money.enums.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accId;
    private String accNum;
    private LocalDate accCreatedDate;
    private String createdUser;
    private Boolean accStatus;

    @Enumerated(EnumType.STRING)
    private AccountType accType;
}
