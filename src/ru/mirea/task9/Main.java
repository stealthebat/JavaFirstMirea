package ru.mirea.task9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Peter", 1050, 3.5));
        students.add(new Student("Ivan", 1060, 2.8));
        students.add(new Student("Oleg", 1040, 4.0));

        System.out.println(students.toString());
        SortingStudentsByGPA.sortStudents(students);
        System.out.println(students.toString());

    }
}


class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() < o2.getGPA()) {
            return 1;
        } else if (o1.getGPA() > o2.getGPA()) {
            return -1;
        } else {
            return  0;
        }
    }

    public static void sortStudents(List<Student> students) {
        students.sort(new SortingStudentsByGPA());
    }
}