package ru.mirea.task8.task8_3;

public class Main {

    public static boolean isPrime(int n, int i) {
        if (n == 2) return true;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i+1);
    }

    public static void main(String[] args) {
        int n = 141;
        if (isPrime(n, 2)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
