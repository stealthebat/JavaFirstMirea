package ru.mirea.task10;

public class Student implements Comparable<Student>{
    String name;
    String surname;
    String degree;
    int year;
    int group;

    public Student(String name, String surname, String degree, int year, int group) {
        this.name = name;
        this.surname = surname;
        this.degree = degree;
        this.year = year;
        this.group = group;
    }

    @Override
    public int compareTo(Student o) {
        return this.getYear() - o.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", degree='" + degree + '\'' +
                ", year=" + year +
                ", group='" + group + '\'' +
                '}';
    }
}
