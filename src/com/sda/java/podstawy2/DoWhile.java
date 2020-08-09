package com.sda.java.podstawy2;

public class DoWhile {

    public static void main(String[] args){

        int i = 10; // wypisze się raz
        do {
            System.out.println("Aktualna wartość " + i);
            i++;
        } while (i < 5);

        int j = 10; // nic się nie wypisze
        while(j < 5){
            System.out.println("Aktualna wartość " + j);
            j++;
        }
    }
}
