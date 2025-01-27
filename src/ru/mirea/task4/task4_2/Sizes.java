package ru.mirea.task4.task4_2;

//Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L).
//Перечисление содержит метод getDescription, возвращающий строку “Взрослый
//размер”. Переопределить метод getDescription - для константы XXS метод
//должен возвращать строку “Детский размер”. Также перечисление должно
//содержать числовое значение euroSize(32, 34, 36, 38, 40), соответствующее
//каждому размеру. Создать конструктор, принимающий на вход euroSize.


public enum Sizes {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}
