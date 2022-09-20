package ru.mirea.task4.task4_4;

public enum ComputerBrands {
    LENOVO,
    HP,
    DELL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
