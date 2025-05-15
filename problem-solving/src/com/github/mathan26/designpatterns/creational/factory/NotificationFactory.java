package com.github.mathan26.designpatterns.creational.factory;

import com.github.mathan26.designpatterns.creational.factory.concrteIml.EmailNotification;
import com.github.mathan26.designpatterns.creational.factory.concrteIml.SmsNotification;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if(type == null || type.isEmpty()) return  null;

        switch (type) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SmsNotification();

            default:
                throw new IllegalArgumentException("Unknown notification type "+type);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        notification.send();
    }
}
