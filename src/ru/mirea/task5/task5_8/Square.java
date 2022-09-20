package ru.mirea.task5.task5_8;

public class Square extends Rectangle {
    protected double side;

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {}

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side='" + side + '\'' +
                ", color=" + color +
                ", filled=" + filled +
                '}';
    }
}
