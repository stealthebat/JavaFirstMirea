package ru.mirea.task2.task2_2;

public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);
        Ball ball1 = new Ball(5.2, 4);
        System.out.println(ball1);
        ball1.move(4, -2);
        System.out.println(ball1);
        ball1.setXY(5, 10);
        System.out.println(ball1);
    }
}
