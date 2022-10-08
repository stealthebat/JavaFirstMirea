package ru.mirea.task6.task6_11;

public class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double measure) {
        return measure * 1.8 + 32;
    }


}