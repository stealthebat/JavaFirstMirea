package ru.mirea.task2.task2_7;

import java.util.Arrays;
import java.util.Comparator;

//Создать
// класс книжная полка, в котором поля данных класса это массив объектов типа
// книги (Book, и количество книг на книжной полке. Написать методы класса,
// которые возвращают книги с самым поздним и самым ранним сроком издания.
// Написать метод класса, позволяющий расставить книги на книжной полке в
// порядке возрастания года выпуска. Используйте реализацию отношений
// композиция классов.
public class BookShelf {
    private Book[] books;
    private int numOfBooks;

    public BookShelf(Book[] books, int numOfBooks) {
        this.books = books;
        this.numOfBooks = numOfBooks;
    }
    
    public Book getBookWithEarliestPublicationYear() {
        Book res = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getPublicationYear() < res.getPublicationYear()) {
                res = books[i];
            }
        }
        return res;
    }

    public Book getBookWithLatestPublicationYear() {
        Book res = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getPublicationYear() > res.getPublicationYear()) {
                res = books[i];
            }
        }
        return res;
    }

    public void sortByPublicationYear() {
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublicationYear() - o2.getPublicationYear();
            }
        });
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + Arrays.toString(books) +
                ", numOfBooks=" + numOfBooks +
                '}';
    }
}
