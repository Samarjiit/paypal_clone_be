package com.paypal.notification_service.service;

import com.paypal.notification_service.entity.Notification;
import org.aspectj.weaver.ast.Not;

import java.util.List;

public interface NotificationService {

    Notification sendNotification(Notification notification);
    List<Notification> getNotificationsForUser(Long userId);
}
