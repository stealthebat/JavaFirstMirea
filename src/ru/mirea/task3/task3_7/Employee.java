package ru.mirea.task3.task3_7;

public class Employee {
    private String fullName;
    private  double salary;

    public Employee(String fullname, double salary) {
        this.fullName = fullname;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
