package ru.mirea.task3.task3_6;


//  1. Создайте объекты класса Double, используя методы valueOf().
//  2. Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
//  3. Преобразовать объект класса Double ко всем примитивным типам.
//  4. Вывести значение объекта Double на консоль.
//  5. Преобразовать литерал типа double к строке: String d = Double.toString(3.14);

public class Main {
    public static void main(String[] args) {
        Double d = Double.valueOf("3.14");

        String s = "123.123321";
        Double d2 = Double.parseDouble(s);

        Double d3 = 2.24;
        int x = d3.intValue();
        byte x1 = d3.byteValue();
        short x2 = d3.shortValue();
        long x3 = d3.longValue();
        float x4 = d3.floatValue();
        double x5 = d3.doubleValue();
        boolean x6 = d3 != 0.0;

        System.out.println(d);

        String s1 = Double.toString(123.312);
    }
}
