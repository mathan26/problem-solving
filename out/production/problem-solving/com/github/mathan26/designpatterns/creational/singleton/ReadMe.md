# Intent:
* Ensure a class has only one instance and provide a global point of access to it.

# ❌ Without Singleton

## Problem:

> Imagine you have a class that handles logging:

` public class Logger { public void log(String message) {
System.out.println("LOG: " + message);
}
}
`

Now, every time you need to log something, you create a new instance:

`Logger logger1 = new Logger();

    Logger logger2 = new Logger();
    logger1.log("User logged in");
    logger2.log("Data saved");
`



#### * 🔥 Issues:

    Multiple instances = More memory usage.

    Inconsistent state if logger stores data (like file handles).

    Hard to manage globally shared resources (e.g., config, DB, file logging).
✅ With Singleton Pattern
Solution:

Make sure only one instance of Logger exists and it's globally accessible.
