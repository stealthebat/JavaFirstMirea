package ru.mirea.task2.task2_5;

public class DogTest {
    public static void main(String[] args) {
        workWithDog();
    }

    private static void workWithDog() {
        DogKennel dogTester = new DogKennel();
        Dog dog1 = new Dog("Bobby", 4);
        Dog dog2 = new Dog("Jack", 1);
        dogTester.addDogs(dog1, dog2, new Dog("Rob", 9));
        System.out.println(dogTester.toString());
        Dog dog = dogTester.getDogsArray().get(0);
        System.out.println(dog.getName() + "'s age in human years is " + dog.ageInHumanYears());
    }
}
