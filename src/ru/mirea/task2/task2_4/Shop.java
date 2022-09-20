package ru.mirea.task2.task2_4;

import ru.mirea.task4.task4_4.Computer;
import ru.mirea.task4.task4_4.ComputerBrands;

import java.util.ArrayList;
import java.util.List;

//Разработайте класс Shop для, реализуйте методы добавления и
//удаления компьютеров в магазине, добавьте метод поиска в магазине
//компьютера, нужного пользователю. Протестируйте работу созданных классов.
//Данные для заполнения массива компьютеров вводятся с клавиатуры
//пользователем. Для этого реализуйте интерфейс
public class Shop {
    List<Computer> computers;

    public Shop(List<Computer> computers) {
        this.computers = computers;
    }
    public Shop() {
        computers = new ArrayList<Computer>();
    }

    public Computer findComputer(ComputerBrands brand) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                return computer;
            }
        }
        System.out.println("Такого компьютера нет");
        return null;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void deleteComputer(int index) {
        computers.remove(index - 1);
    }

    public void listComputers() {
        for (int i = 0; i < computers.size(); i++) {
            System.out.println((i+1) + ") " + computers.get(i).toString());
        }
    }
}
