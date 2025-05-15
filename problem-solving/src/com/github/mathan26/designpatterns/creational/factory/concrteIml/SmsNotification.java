package com.github.mathan26.designpatterns.creational.factory.concrteIml;

import com.github.mathan26.designpatterns.creational.factory.Notification;

public class SmsNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}
