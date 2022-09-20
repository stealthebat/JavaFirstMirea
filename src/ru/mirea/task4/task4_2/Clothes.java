package ru.mirea.task4.task4_2;

public abstract class Clothes {
    private Sizes size;
    private double price;
    private String color;

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
