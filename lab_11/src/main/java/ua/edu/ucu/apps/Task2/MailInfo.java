package ua.edu.ucu.apps.Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class MailInfo {
    private Client client;
    private MailCode mailCode;
}
