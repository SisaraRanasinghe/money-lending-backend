package com.lending.money.controller;

import com.lending.money.entity.Notification;
import com.lending.money.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/createNotification")
    public ResponseEntity<Notification> addNotification(@RequestBody Notification notification) {

        Notification addNotification = notificationService.addNotification(notification);
        return new ResponseEntity<>(addNotification, HttpStatus.CREATED);
    }
}
