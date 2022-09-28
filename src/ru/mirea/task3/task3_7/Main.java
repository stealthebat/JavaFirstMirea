package ru.mirea.task3.task3_7;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        workWithReport();
    }

    public static void workWithReport() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Иванов И.И.", 10200.5));
        employees.add(new Employee("Петров Т.Т.", 48500.232));
        employees.add(new Employee("Козлов К.К.", 100500.41));

        Report.generateReport(employees);
    }
    public static void internetShop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("В какой валюте оплатить заказ?");
        System.out.println("1) EUR\n2) USD\n3) RUB");
        int currencyType = sc.nextInt();
        System.out.println("Введите стоимость заказа: ");
        double sum = sc.nextDouble();
        double result;
        switch (currencyType) {
            case 1:
                result = Converter.convertCurrency(sum, false);
                break;
            case 2:
                result = Converter.convertCurrency(sum, true);
                break;
            default:
                result = sum;
                break;
        }

        System.out.printf("К оплате: %.2f", result);

    }
}
