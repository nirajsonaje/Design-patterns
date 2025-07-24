public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
