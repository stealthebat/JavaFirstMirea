package ru.mirea.task29.task29_1_3;

public interface Order {
    boolean add(MenuItem item);
    String[] itemName();
    int itemQuantity(String itemName);
    int itemQuantity();
    String[] getMenu();
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    boolean removeAll(String itemName);
    double costTotal();
    Customer getCustomer();
    void setCustomer(Customer newCustomer);
}
