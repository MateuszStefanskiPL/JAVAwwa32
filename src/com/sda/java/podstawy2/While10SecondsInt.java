package com.sda.java.podstawy2;

import java.util.Scanner;

public class While10SecondsInt {

    public static void main(String[] args){

        long time = System.currentTimeMillis(); // w milisekundach!
        long timeEnd = System.currentTimeMillis() + 10000;
        Scanner scanner = new Scanner(System.in);
        // deklaracja sumy
        int sum = 0;
        while(time <= timeEnd){
            // pobieraj liczbę
            System.out.println("Podaj liczbę");
            int value = scanner.nextInt();
            // zsumuj
            if(value > 10){
                sum += value; // sum = sum + value
            } else {
                sum -= value; // odejmujemy dla liczb mniejszych od 10
            }
            // aktualizacja zmiennej time
            time = System.currentTimeMillis();
        }
        System.out.println(sum); // wyświetl wynik
    }

}
