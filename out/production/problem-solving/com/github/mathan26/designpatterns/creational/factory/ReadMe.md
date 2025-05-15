# 🏭 Factory Method Pattern
## ✅ Intent

- Define an interface for creating an object, but let subclasses decide which class to instantiate.

❌ Without Factory Pattern
Problem:

Suppose we need to send notifications (Email, SMS, Push).

`   public class NotificationService {
public void notifyUser(String type) {
if (type.equals("EMAIL")) {
new EmailNotification().send();
} else if (type.equals("SMS")) {
new SMSNotification().send();
} else if (type.equals("PUSH")) {
new PushNotification().send();
}
}
}
`

🔥 Issues:

    Violates Open/Closed Principle: Every time you add a new type, you modify the existing code.

    Hard to test or extend.

    Conditional logic becomes messy as more types are added.
