package ru.mirea.task25.task25_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a string to check: ");
        String input = sc.nextLine();

        if(isStringIPAddress(input)) {
            System.out.println("The string is an IP address");
        }
        else {
            System.out.println("The string is not an IP address");
        }
    }

    static boolean isStringIPAddress(String string) {
        Pattern pattern = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
