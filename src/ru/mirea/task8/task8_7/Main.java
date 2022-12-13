package ru.mirea.task8.task8_7;

public class Main {
    public static void factorize(int n, int factor) {
        if (n < 2) return;
        if (n % factor == 0) {
            System.out.println(factor);
            factorize(n / factor, factor);
        } else {
            factorize(n, factor + 1);
        }
    }

    public static void main(String[] args) {
        int n = 998911;
        System.out.println(n + " factorized:");
        factorize(n, 2);
    }
}
