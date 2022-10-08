package ru.mirea.task6.task6_10;

public enum ComputerBrands {
    LENOVO,
    HP,
    DELL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
