package ru.mirea.task7.task7_3;

import ru.mirea.task6.task6_1.Movable;

class MovablePoint {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x += xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }
}

public class MovableRectangle {
    MovablePoint topLeft;
    MovablePoint topRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint topRight, double xSpeed, double ySpeed) {
        this.topLeft = topLeft;
        this.topRight = topRight;
    }

    String intToString(double value) {
        return String.valueOf(value);
    }
    boolean SpeedTest() {
        return topLeft.xSpeed == topRight.xSpeed &&
                topLeft.ySpeed == topRight.ySpeed;
    }
}
