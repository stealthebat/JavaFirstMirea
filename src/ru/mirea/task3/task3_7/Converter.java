package ru.mirea.task3.task3_7;

public class Converter {
    public static double convertCurrency(double value, boolean toUSD) {
        double result;
        if (toUSD) { // To USD
            result = value / 58.28;
        }
        else { // To EUR
            result = value / 56.32;
        }

        return result;
    }

}
