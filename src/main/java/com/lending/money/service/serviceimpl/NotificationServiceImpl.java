package com.lending.money.service.serviceimpl;

import com.lending.money.entity.Notification;
import com.lending.money.repository.NotificationRepository;
import com.lending.money.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public Notification addNotification(Notification notification) {
        return notificationRepository.save(notification);

    }
}
