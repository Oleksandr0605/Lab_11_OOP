package ua.edu.ucu.apps.Task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    private static MailSender mailSender = new MailSender();

    public MailBox(List<MailInfo> infos) {
        this.infos = infos;
    }

    public MailBox() {
        infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }
    public void sendAll() {
        for (MailInfo info : infos) {
            mailSender.sendMail(info);
        }
    }
}
