package ru.mirea.task8.task8_5;

public class Main {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        return (s.charAt(0) == s.charAt(s.length()-1)) &&
               isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String s = "aaacasdasdbaasdasdasdasdbaaa";
        if (isPalindrome(s)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
