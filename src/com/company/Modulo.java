package com.company;

import java.util.Scanner;

public class Modulo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean continueLoop = true;
        while(continueLoop){

            System.out.println("Podaj pierwszą liczbę");
            int value1 = in.nextInt();

            System.out.println("Podaj drugą liczbę");
            int value2 = in.nextInt();

            if(value1 % 2 == 0){
                System.out.println(String.format("Liczba %d jest parzysta", value1));
            } else {
                System.out.println(String.format("Liczba %d nie jest parzysta", value1));
            }

            if(value1 % value2 == 0){
                System.out.println(String.format("Liczba %d dzieli się przez %d", value1, value2));
            } else {
                System.out.println(String.format("Liczba %d nie dzieli się przez %d", value1, value2));
            }

            System.out.println("Wpisz STOP żeby zakończyć program");
            in.nextLine();
            String command = in.nextLine();
            if(command.equals("STOP")){
                System.out.println("Do widzenia!");
                continueLoop = false;
            }
        }
        System.out.println("KONIEC");
    }
}
