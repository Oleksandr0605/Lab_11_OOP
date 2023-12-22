package ua.edu.ucu.apps.Task1;

import java.util.Arrays; // Import the Arrays class
public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Oleksandr Ivaniuk")
                .age(18)
                .weight(60)
                .height(174)
                .cityStrings(Arrays.asList("Lviv", "Kamianets")) // Pass a collection of strings
                .gender(Gender.MALE)
                .build();
        System.out.println(user);
    }
}