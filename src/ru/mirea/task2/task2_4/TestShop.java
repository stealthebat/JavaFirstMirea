package ru.mirea.task2.task2_4;

import ru.mirea.task4.task4_4.*;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addComputer(new Computer(
                new Processor(4),
                new Memory(8),
                new Monitor("1680x1050"),
                ComputerBrands.HP
        ));
        shop.addComputer(new Computer(
                new Processor(2),
                new Memory(4),
                new Monitor("1440x1080"),
                ComputerBrands.DELL
        ));
        shop.addComputer(new Computer(
                new Processor(8),
                new Memory(32),
                new Monitor("1920x1080"),
                ComputerBrands.LENOVO
        ));
        Scanner sc = new Scanner(System.in);
        int coresNum = sc.nextInt();
        int sizeInGB = sc.nextInt();
        String resolution = sc.next();
        ComputerBrands brand = ComputerBrands.valueOf(sc.next().toUpperCase());
        shop.addComputer(new Computer(
                new Processor(coresNum),
                new Memory(sizeInGB),
                new Monitor(resolution),
                brand
        ));

        shop.listComputers();
        shop.deleteComputer(2);
        shop.listComputers();
        System.out.println(shop.findComputer(ComputerBrands.LENOVO));
    }
}
