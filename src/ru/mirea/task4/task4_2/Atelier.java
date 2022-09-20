package ru.mirea.task4.task4_2;

//Создать массив, содержащий все типы одежды. Создать класс Atelier
//(Ателье), содержащий методы dressWomen, dressMan, на вход которых
//будет поступать массив, содержащий все типы одежды ( подумайте
//какой тип будет у массива). Переопределите метод dressWomen() для
//вывода на консоль всей информации о женской одежде. То же самое
//сделайте для метода dressMan().

public class Atelier {

    public void dressMan(Clothes[] clothesArray) {
        for (Clothes clothes: clothesArray) {
            System.out.println(clothes.toString());
        }
    }
}
