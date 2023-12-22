package ua.edu.ucu.apps.Task2;

public class MailSender {
    public void sendMail(MailInfo info) {
        System.out.println("Send mail of type " + info.getMailCode() + " to " + info.getClient().getName());
    }
}
