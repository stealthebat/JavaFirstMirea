package ru.mirea.task17;

public class EmployeeController {
    Employee model;
    EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public String getName() {
        return model.getName();
    }

    public void setName(String name) {
        model.setName(name);
    }

    public String getId() {
        return model.getId();
    }

    public void setId(String id) {
        model.setId(id);
    }

    public double getSalaryPerHour() {
        return model.getSalaryPerHour();
    }

    public void setSalaryPerHour(double salaryPerHour) {
        model.setSalaryPerHour(salaryPerHour);
    }

    public int getHoursWorked() {
        return model.getHoursWorked();
    }

    public void setHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }

    public void updateView() {
        view.printEmployeeInfo(model.getName(), model.getId(), model.getSalaryPerHour(), model.getHoursWorked());
    }

}
