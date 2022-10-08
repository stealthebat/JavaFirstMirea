package ru.mirea.task6.task6_6to9;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[5];
        printables[0] = new Book();
        printables[1] = new Book();
        printables[2] = new Shop();
        printables[3] = new Book();
        printables[4] = new Shop();

        for (Printable printable:
             printables) {
            printable.print();
        }
    }
}
