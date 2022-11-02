package ru.mirea.task17;

import javax.swing.plaf.ColorUIResource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee model = getEmployeeFromDatabase();

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setHoursWorked(25);
        controller.setId("5");

        System.out.println("\nUpdated info about worker: ");

        controller.updateView();
    }

    private static Employee getEmployeeFromDatabase() {
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        employee.setName(sc.next());
        employee.setId(sc.next());
        employee.setSalaryPerHour(sc.nextDouble());
        employee.setHoursWorked(sc.nextInt());
        return employee;
    }
}
