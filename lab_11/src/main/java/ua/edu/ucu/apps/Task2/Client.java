package ua.edu.ucu.apps.Task2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private int id;
    private String name;
    private Gender sex;
    private int age;
    private static int count = 0;

    public Client(String name_arg, Gender sex_arg, int age_arg) {
        name = name_arg;
        sex = sex_arg;
        age = age_arg;
        id = ++count;
    }
}
