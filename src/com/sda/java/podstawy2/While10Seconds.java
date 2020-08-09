package com.sda.java.podstawy2;

import java.util.Scanner;

public class While10Seconds {

    public static void main(String[] args){

        long time = System.currentTimeMillis(); // w milisekundach!
        long timeEnd = System.currentTimeMillis() + 10000;
        // dodać scanner
        Scanner scanner = new Scanner(System.in);
        while(time <= timeEnd){
            // pobieraj produkt
            System.out.println("Podaj nazwę produktu");
            String product = scanner.nextLine();
            // wyświetl produkt na ekranie
            System.out.println(product);
            // aktualizacja zmiennej time
            time = System.currentTimeMillis();
        }
        System.out.println("Program zakończył działanie");
    }
}
