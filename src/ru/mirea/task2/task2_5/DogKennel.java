package ru.mirea.task2.task2_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DogKennel {
    private List<Dog> dogs;

    public DogKennel() {
        this.dogs = new ArrayList<Dog>();
    }

    public DogKennel(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public void addDogs(Dog ... dogs) {
        Collections.addAll(this.dogs, dogs);
    }

    public List<Dog> getDogsArray() {
        return dogs;
    }
    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + dogs +
                '}';
    }
}
