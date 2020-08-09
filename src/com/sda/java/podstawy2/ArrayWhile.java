package com.sda.java.podstawy2;

import java.util.Random;
import java.util.Scanner;

public class ArrayWhile {

    public static void main(String[] args){
        String[] equipment = {"miecz", "zbroja", "złoto", "łuk"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę przedmiotu.. Wpisz STOP aby zakończyć.");
        String item = scanner.nextLine();
        while(!item.equals("STOP")){
            System.out.println("Wpisany przedmiot: " + item);
            System.out.println("Podaj nazwę przedmiotu.. Wpisz STOP aby zakończyć.");
            item = scanner.nextLine();
        }

        // tradycyjne wypisywanie
        for(int i = 0; i < equipment.length; i++){
            System.out.println(equipment[i]);
            System.out.println(i);
        }
        // wypisywanie po elementach
        int j = 0;
        /*String itemEq = equipment[0];
        itemEq = equipment[1];
        itemEq = equipment[2];*/
        for(String itemEq : equipment){
            System.out.println(j);
            System.out.println(itemEq);
            j++;
        }

    }

}
