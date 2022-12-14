package ru.mirea.task29.task29_1_3;

public class OrderAlreadyException extends Exception {
    public OrderAlreadyException(int num) {
        super("The table " + num + " is added!");
    }
}
