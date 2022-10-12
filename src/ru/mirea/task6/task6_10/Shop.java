package ru.mirea.task6.task6_10;

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

    public List<Computer> findComputer(ComputerBrands brand) {
        List<Computer> res = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                res.add(computer);
            }
        }
        if (res.size() == 0) {
            System.out.println("Таких компьютеров нет");
            return null;
        }
        else {
            return res;
        }
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
