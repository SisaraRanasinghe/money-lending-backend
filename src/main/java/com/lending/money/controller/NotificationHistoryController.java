package com.lending.money.controller;

import com.lending.money.entity.NotificationHistory;
import com.lending.money.service.NotificationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class NotificationHistoryController {

    @Autowired
    private NotificationHistoryService notificationHistoryService;

    @PostMapping("/createNotificationHistory")
    public ResponseEntity<NotificationHistory> addNotificationHistory(@RequestBody NotificationHistory notificationHistory) {

        NotificationHistory addNotificationHistory = notificationHistoryService.addNotificationHistory(notificationHistory);
        return new ResponseEntity<>(addNotificationHistory, HttpStatus.CREATED);
    }

}
