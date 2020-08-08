package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        int value1 = in.nextInt();
        System.out.println("Podaj drugą liczbę");
        int value2 = in.nextInt();

        System.out.println("Suma, różnica, mnożenie, dzielenie?");
        in.nextLine();
        String op = in.nextLine();

        if(op.equals("suma")){
            System.out.println(String.format("%d + %d = %d", value1, value2, value1+value2));
        } else if (op.equals("różnica")){
            System.out.println(String.format("%d - %d = %d", value1, value2, value1-value2));
        } else if (op.equals("mnożenie")){
            System.out.println(String.format("%d * %d = %d", value1, value2, value1*value2));
        } else if (op.equals("dzielenie")){
            if(value2 == 0){
                System.out.println("Nie dzieli się przez zero!");
            } else {
                System.out.println(String.format("%d / %d = %.2f",
                        value1, value2, (double)value1/(double)value2));
            }
        } else {
            System.out.println("Niepoprawna operacja");
        }
    }
}
