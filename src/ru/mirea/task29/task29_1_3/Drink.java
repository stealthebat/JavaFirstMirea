package ru.mirea.task29.task29_1_3;

public final class Drink extends MenuItem implements Alcoholable{
    private final DrinkTypeEnum type;
    private final double alcoholVol;

    public Drink(String name, String description, int cost, DrinkTypeEnum type, double alcoholVol) {
        super(name, description, cost);
        this.type = type;
        this.alcoholVol = alcoholVol;
    }
    public DrinkTypeEnum getType(){
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return type.isAlcohol();
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
