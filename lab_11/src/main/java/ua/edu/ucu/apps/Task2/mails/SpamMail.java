package ua.edu.ucu.apps.Task2.mails;

import ua.edu.ucu.apps.Task2.MailCode;

public class SpamMail implements MailCode {
    @Override
    public String getMailCode() {
        return "spam";
    }
}
