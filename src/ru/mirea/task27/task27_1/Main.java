package ru.mirea.task27.task27_1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static <T> Set<T> setToTreeSet(Set<T> hashSet)
    {
        return new TreeSet<>(hashSet);
    }

    public static void main(String[] args)
    {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Bob");
        hashSet.add("Mary");
        hashSet.add("Alice");

        Set<String> treeSet = setToTreeSet(hashSet);
        System.out.println(treeSet);
        System.out.println(treeSet.getClass());
    }
}
