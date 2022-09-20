package ru.mirea.task4.task4_2;


public class TShirt extends Clothes implements MenClothing, WomenClothing {
    @Override
    public void dressMan() {
        System.out.println("Man dressed in TShirt");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman dressed in TShirt");
    }
}
