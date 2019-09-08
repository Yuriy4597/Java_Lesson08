package com.company_HomeWork_Task_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Задано масив цілих чисел. Вивести масив в оберненому порядку, а потім видалити з нього повторні входження кожного елемента.

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(4);
        list.add(1);
        list.add(1);

            Collections.reverse(list);  // вивід в оберненому порядку
            System.out.println("\n" + list);

        Set<Integer> setFromList = new HashSet<>(list);     // забераємо повторні входження
        System.out.println("\n" + setFromList);


















//        int[] array = new int[]{1, 3, 5, 9, 4, 4, 1 , 1};
//        int[] arrayRepeat = new int[]{};
//        for (int i = array.length - 1; i >= 0; i--) {
//            for (int j = 0; i < arrayRepeat.length; j++) {
//                if(array[i] == arrayRepeat[j]){
//                    array[i]  //delete
//                }else{
//                    arrayRepeat[j] //add  дописати
//                }
//            }
//            System.out.println(array[i] + "");
//        }
   }
}




