package com.company_HomeWork_Task_3;



public class Main {

    // Найменший елемент масиву замінити цілою частиною середнього арифметичного всіх елементів.
    // Якщо в масиві є декілька найменших елементів, то замінити останній з них.
    public static void main(String[] args) {


        int array[] =  new int[]{4, 6, 1, 1, 12, 31, 1, 78};
        int countValue = 0;
        int positionChange = 0;

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            countValue = countValue + array[i];  // рахуємо суму чисел
            if (min >= array[i]) {   // проходимося по нашому коридору елементів в пошуку найменшого.
                min = array[i];
            positionChange = i;}
        }
        System.out.println("\t number change position = "  + positionChange); // від 0 - 6, (7)
         int avarageValue = (countValue /array.length );

        System.out.println("\tavarageValue = " + avarageValue); // Виводимо середнє арифметичне на екран.
        System.out.println("\tThe minimum value in the array: " + min + " \n\tcountValue = "+ countValue);

        array[positionChange] = avarageValue; // заміняємо найменший елемент

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // Виводим елементи масиву на екран
        }

    }
}

