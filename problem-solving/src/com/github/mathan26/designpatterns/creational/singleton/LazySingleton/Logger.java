package com.github.mathan26.designpatterns.creational.singleton.LazySingleton;

public class Logger {
    private static Logger instance;

    private Logger(){
//        private constructor , cannot allow you to create object outside
    }

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}


class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("some log event");
    }
}
