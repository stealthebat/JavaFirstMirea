package ru.mirea.task24.task24_2;

public class Main {
    public static void main(String[] args) {
        // Factory
        FactoryChairs myFactory = new FactoryChairs();
        // Chairs
        Chair victorian = myFactory.createChair(ChairType.VICTORIAN, "Pink", 15);
        Chair multifunctional = myFactory.createChair(ChairType.MULTIFUNCTIONAL, "Yellow", 11);
        Chair magic = myFactory.createChair(ChairType.MAGIC, "Grey", 17);
        // Client
        Client client = new Client("Sergey", 21);
        client.sit(multifunctional);
        client.sit(magic);
        client.sit(victorian);
    }
}
