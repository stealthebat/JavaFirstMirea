package ru.mirea.task4.task4_1_2;

public class TestPhone {
    public static void main(String [ ] args) {;
        Phone phone2 = new Phone("88005553535", "Nokia 3310", "151");
        Phone phone3 = new Phone("89999999999", "iPhone 14", "174");


        System.out.println("Instance Information: " + phone2.toString());
        System.out.println("Instance Information: " + phone3.toString());

        phone2.receiveCall("Alex");
        phone3.receiveCall("Andrew");

        System.out.println("Phone number: " + phone2.getNumber());
        System.out.println("Phone number: " + phone3.getNumber());

        phone2.receiveCall("Maxim", phone2.getNumber());

        phone2.sendMessage(phone2.getNumber(), phone3.getNumber());
    }
}
