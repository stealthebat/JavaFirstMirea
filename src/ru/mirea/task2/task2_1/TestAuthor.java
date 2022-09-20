package ru.mirea.task2.task2_1;


public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Andrew", "andrew.b.s2003@gmail.com", 'M');
        System.out.println(author);
        System.out.println(author.getName());
        author.setEmail("destroyer2005@mail.ru");
        System.out.println(author.getEmail());
    }
}
