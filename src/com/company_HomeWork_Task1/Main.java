package com.company_HomeWork_Task1;

import java.util.Arrays;
import java.util.List;



public class Main {

    public static void main(String[] args) {

        // Написати програму для роботи з списком. У першій половині списку замінити всі входження деякого елементу Е1
        // на  будь-який інший елемент Е2;

        List<String> sDev = Arrays.asList("ANNA", "BOB", "TOM", "Yuriy", "Andrey");
        List<Integer> iAut = Arrays.asList(1, 4, 3,  5, 7 , 8 , 9 ,10);
        System.out.println("ArrayList elements : " + sDev +"   \t\t\t   " + iAut);

        replace(sDev, "BOB", "JOHN");
        replace(iAut, 1, 45);

        System.out.println("\n after replace: " + sDev + "   \t\t\t\t   "+ iAut);


    }


    public static void replace(List list, Object e1, Object e2) {
        for (int i = 0; i < list.size() / 2 ; i++) {
            if (list.get(i).equals(e1)) {
                list.set(i, e2);
            }
        }
    }




       }







































