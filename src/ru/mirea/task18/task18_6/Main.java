package ru.mirea.task18.task18_6;

public class Main {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        // Шаг 1-2
        // При вызове с корректным значением программа отработает и выведет переданное значение
        // При вызове с нулем в качестве значением программа выбросит исключение и завершит работу

        // Шаг 3
        // С использованием блока try-catch прогамма отрабатывает корректно для
        // любых входных данных, уведомляя пользователя об ошибке, если она возникает
        demo.printMessage("123");


    }
}

class ThrowsDemo {
    public void printMessage(String key) {
        String message;
        try {
            message = getDetails(key);
        } catch (NullPointerException e) {
            message = e.getMessage();
        }
        System.out.println(message);
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for: " + key;
    }

}
