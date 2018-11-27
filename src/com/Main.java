package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"
        Pattern p = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher m = p.matcher("My email is jarik@shmail.ru but my another email is jarik@yandex.ru");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");

    }
}
