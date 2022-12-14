package ru.mirea.task29.task29_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws OrderAlreadyException {
        ArrayList<String> dish = new ArrayList<>();
        dish.add("Pizza: Peperoni: 590");
        dish.add("Pizza: 4 cheeses: 550");
        dish.add("Lasagna: Tasty Italian dish: 600");
        dish.add("Greek salad: Vegetables: 320");
        dish.add("Water: original, carbonated: 160");
        dish.add("Beer: light, dark: 260");
        dish.add("Juice: Orange, Apple, Multi: 190");
        System.out.println("Menu: ");
        for (String s: dish)
            System.out.println(s);

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addPosition(new Dish("Lasagna", "Tasty Italian dish", 750));
        restaurantOrder.addPosition(new Drink("Juice", "Orange", 150));
        System.out.println("\nPositions in the order: " + restaurantOrder.count());
        System.out.println(Arrays.toString(restaurantOrder.getDishes()));

        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        restaurantOrder1.addPosition(new Dish("Greek salad", "Vegetables", 224));
        restaurantOrder1.addPosition(new Dish("Pizza", "4 cheeses", 345));
        restaurantOrder1.addPosition(new Drink("water", "original, carbonated", 100));
        System.out.println("Positions in the order: " + restaurantOrder1.count());
        System.out.println(Arrays.toString(restaurantOrder1.getDishes()));

        System.out.println("\n" + "Restaurant orders: ");
        OrderManager orderManager = new OrderManager();
        orderManager.add(restaurantOrder, 3);
        orderManager.add(restaurantOrder1, 4);
        System.out.println(orderManager.orders());

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addPosition(new Dish("Pizza", "Peperoni", 440));
        internetOrder.addPosition(new Dish("Pizza", "Peperoni", 440));
        internetOrder.addPosition(new Dish("Pizza", "4 cheeses", 550));
        System.out.println("\n" + "Internet orders: ");
        orderManager.add(internetOrder, "Moscow");
        System.out.println(orderManager.getInternetOrder());
    }
}

