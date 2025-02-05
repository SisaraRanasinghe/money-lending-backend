package com.lending.money.entity;


import com.lending.money.enums.NotificationStatus;
import com.lending.money.enums.NotificationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ntfId;
    private String emailTemplateCode;
    private String emailTemplateCdeDesc;
    private LocalDate ntfCreatedDate;

    @Enumerated(EnumType.STRING)
    private NotificationStatus ntfStatus;

    @Enumerated(EnumType.STRING)
    private NotificationType ntfType;

    @ManyToOne
    @JoinColumn(name = "fk_app_id", nullable = false)
    private Application application;
}
