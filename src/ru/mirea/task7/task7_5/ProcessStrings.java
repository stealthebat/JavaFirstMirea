package ru.mirea.task7.task7_5;

public class ProcessStrings implements StringProcessor {
    @Override
    public int getStringLength(String s) {
        return s.length();
    }

    @Override
    public String getSymbolsAtOddPos(String s) {
        StringBuilder res = new StringBuilder();
        if (s.length() < 1) return "";
        for (int i = 1; i < s.length(); i+=2) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    @Override
    public String reverseString(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}
