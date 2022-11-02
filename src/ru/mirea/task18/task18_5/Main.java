package ru.mirea.task18.task18_5;

public class Main {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        // Шаг 2
        // При добавлении блока try-catch мы также можем получить информацию
        // о выброшенном исключении, в сообщении будет содержаться строка,
        // которую мы передали в качестве аргумента в исключение.
        demo.getDetails(null);


    }
}

class ThrowsDemo {

    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

