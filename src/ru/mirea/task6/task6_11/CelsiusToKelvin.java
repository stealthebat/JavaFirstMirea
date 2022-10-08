package ru.mirea.task6.task6_11;

public class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double measure) {
        return measure + 273.15;
    }


}