package ru.mirea.task8.task8_4;

public class Main {
    static int callCount;
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
        factorize(n, 2);
    }
}
