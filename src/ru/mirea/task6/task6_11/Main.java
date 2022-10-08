package ru.mirea.task6.task6_11;

public class Main {
    public static void main(String[] args) {
        CelsiusToFahrenheit o1 = new CelsiusToFahrenheit();
        CelsiusToKelvin o2 = new CelsiusToKelvin();
        double cels = 34.2;
        System.out.println("In Fahrenheit: " + o1.convert(cels));
        System.out.println("In Kelvin: " + o2.convert(34.2));

    }
}
