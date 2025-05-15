package com.github.mathan26.designpatterns.creational.factory.concrteIml;

import com.github.mathan26.designpatterns.creational.factory.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }
}
