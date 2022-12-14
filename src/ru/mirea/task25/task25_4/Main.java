package ru.mirea.task25.task25_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a string to check: ");
        String input = sc.nextLine();

        if(areParenthesesRight(input)) {
            System.out.println("The string is correct");
        }
        else {
            System.out.println("The string is not correct");
        }
    }

    static boolean areParenthesesRight(String string) {
        Pattern pattern = Pattern.compile("\\([^()]*\\)");
        Matcher matcher = pattern.matcher(string);
        do {
            string = matcher.replaceAll("");
            matcher = pattern.matcher(string);
        } while (matcher.find());

        return string.matches("[^()]+");
    }
}
