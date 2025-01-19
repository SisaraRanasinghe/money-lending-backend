package com.lending.money.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "NotificationHistory")
public class NotificationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ntfHisId;
    private String emailContent;
    private String smsContent;
    private String toEmail;
    private String fromEmail;
    private String ccEmail;
    private String toSms;
    private LocalDate sentDate;

    @ManyToOne
    @JoinColumn(name = "fk_ntf_id", nullable = false)
    private Notification notification;
}
