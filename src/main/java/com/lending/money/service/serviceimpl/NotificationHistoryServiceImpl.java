package com.lending.money.service.serviceimpl;

import com.lending.money.entity.NotificationHistory;
import com.lending.money.repository.NotificationHistoryRepository;
import com.lending.money.service.NotificationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationHistoryServiceImpl implements NotificationHistoryService {

    @Autowired
    private NotificationHistoryRepository notificationHistoryRepository;

    @Override
    public NotificationHistory addNotificationHistory(NotificationHistory notificationHistory) {
        return notificationHistoryRepository.save(notificationHistory);

    }
}
