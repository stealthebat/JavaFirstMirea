package ru.mirea.task18.task18_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exception2 exception = new Exception2();

        // Шаг 2
        // При вводе Qwerty и 1.2 выбрасывается NumberFormatException из-за неправильных данных, переданных в parseInt
        // При вводе 0 выбрасывается ArithmeticExpression из-за деления на ноль
        // При вводе 1 программа корректно отрабытывает
        // exception.exceptionDemo();

        // Шаг 3
        // Используя блок try-catch, мы можем вывести информацию об исключении
        // без завершения прогаммы и узнать, какое именно исключение было брошено.
        exception.exceptionDemoTry();
    }
}

class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner= new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }

    public void exceptionDemoTry() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Wrong format");
        }

    }
}