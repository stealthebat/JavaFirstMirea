package ru.mirea.task17;

public class EmployeeView {
    public void printEmployeeInfo(String name, String id, double salaryPerHour, int hoursWorked) {
        System.out.println("Info about worker:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary per hour: " + salaryPerHour);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Final salary: " + (salaryPerHour * hoursWorked));
    }
}
