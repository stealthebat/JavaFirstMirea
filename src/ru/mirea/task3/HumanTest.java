package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human.HumanBuilder()
                .setHead("Blue", "Green")
                .setLeftHand(5, 15)
                .setRightHand(5, 15)
                .setLeftLeg(4, true)
                .setRightLeg(5, true)
                .build();

        System.out.println(human);
    }
}
