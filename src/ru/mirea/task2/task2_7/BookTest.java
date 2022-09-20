package ru.mirea.task2.task2_7;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Don DeLillo",
                "White Noise",
                "Novel",
                1985);
        Book book1 = new Book(
                "Gustave Flaubert",
                "Sentimental Education",
                "Realism",
                1869
        );
        Book book2 = new Book(
                "Henrik Ibsen",
                "A Doll's House",
                "Modern tragedy",
                1879
        );

        BookShelf bookShelf = new BookShelf(new Book[]{book, book1, book2}, 3);
        System.out.println(bookShelf.getBookWithEarliestPublicationYear());
        System.out.println(bookShelf.getBookWithLatestPublicationYear());
        System.out.println(bookShelf);
        bookShelf.sortByPublicationYear();
        System.out.println(bookShelf);

    }
}
