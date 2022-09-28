package ru.mirea.task3.task3_7;

import java.util.List;

public class Report {
    public static void generateReport(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.printf("%s: %10s RUB\n", employee.getFullName(), String.format("%4.2f", employee.getSalary()));
        }
    }
}
