package org.example.Head002_OOProgramming.topic04_SOLID.example02;

public class DipTest {
  public static void main(String[] args) {


    NotificationSender[] notificationSenders = {
        new EmailNotificationSender(), new SmsNotificationSender()
    };

    for(NotificationSender notificationSender : notificationSenders) {
      NotificationService notificationService = new NotificationService(notificationSender);
      notificationService.send("Hello World");
    }
  }
}

interface NotificationSender{
  void send(String message);
}

class EmailNotificationSender implements NotificationSender{
  @Override
  public void send(String message) {
    System.out.println("이메일 전송: "+ message);
  }
}

class SmsNotificationSender implements NotificationSender{
  @Override
  public void send(String message) {
    System.out.println("문자 전송: "+message);
  }
}

class NotificationService{
  private final NotificationSender notificationSender;

  public NotificationService(NotificationSender notificationSender) {
    this.notificationSender = notificationSender;
  }
  public void send(String message) {
    notificationSender.send(message);
  }
}