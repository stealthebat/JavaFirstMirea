package ru.mirea.task2;

public class Shape {

    private Type type;
    private Size size;
    private String color;

    public Shape(Type type, Size size, String color) {
        this.type = type;
        this.size = size;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", type=" + type +
                ", size=" + size +
                '}';
    }

}


enum Type {
    SQUARE,
    TRIANGLE,
    CIRCLE
}

enum Size {
    SMALL,
    MEDIUM,
    LARGE
}