package ru.mirea.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        students.add(new Student("Peter", 1050, 3.5));
        students.add(new Student("Ivan", 1060, 2.8));
        students.add(new Student("Oleg", 1040, 4.0));

        System.out.println(students.toString());
        sorter.sortStudents(students);
        System.out.println(students.toString());
    }
}


class SortingStudentsByGPA implements Comparator<Student> {

     int partition(List<Student> arr, int low, int high) {
        Student pivot = arr.get(high);

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            // arr.get(j).getGPA() >= pivot.getGPA()
            if (this.compare(arr.get(j), pivot) < 0) {
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, high);
        return (i + 1);
    }

     void quickSort(List<Student> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

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

    public void sortStudents(List<Student> students) {
        quickSort(students, 0, students.size() - 1);
    }
}