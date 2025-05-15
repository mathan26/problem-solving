package com.github.mathan26.designpatterns.creational.singleton.best;

// Singleton via Enum (Thread-safe and Simple)
public enum Logger {
    INSTANCE;

    public void log(String message) {
        System.out.println("LOG: "+message);
    }
}
