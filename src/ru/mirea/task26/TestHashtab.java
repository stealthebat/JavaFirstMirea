package ru.mirea.task26;

public class TestHashtab {
    public static void main(String[] args) {
        hashtab hashTable = new hashtab();
        hashTable.hashtabInit(10, 0.75f);

        hashTable.hashtabAdd("Mary", 12);
        hashTable.hashtabAdd("Andrew", 14);
        hashTable.hashtabAdd(15, "Bella");
        hashTable.hashtabAdd("Alex", 31);
        hashTable.hashtabAdd("Max", 4);
        hashTable.hashtabAdd("Marie", "Rosa");
        hashTable.hashtabAdd(1125, 24);
        hashTable.hashtabAdd("Rosa", "Angel");
        hashTable.hashtabAdd(0.005, 12f);
        hashTable.hashtabAdd('1', "One");

        hashTable.hashtabLookup(15);
        hashTable.hashtabDelete(15);
        hashTable.hashtabLookup(15);

        hashTable.hashtabLookup("New");
        hashTable.hashtabAdd("New", "World");
        hashTable.hashtabLookup("New");
    }
}
