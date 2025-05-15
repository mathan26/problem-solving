package com.github.mathan26.designpatterns.creational.singleton.ThreadSafe;

public class Logger {
    private static Logger instance;

    public Logger getInstance() {
        if (instance == null) {
            if (instance == null) {
                synchronized (Logger.class) {
                    instance = new Logger();
                }
            }
        }
        return instance;

    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

