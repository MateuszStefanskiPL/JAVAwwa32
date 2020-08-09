package com.sda.java.podstawy2;

public class Loops {

    public static void main(String[] args){

        // dekrementacja
        for (int i = 5; i >= 0 ; i--) {
            if(i == 0){
                System.out.println("BOOM!");
            } else {
                System.out.println("Odliczanie: " + i);
            }
        }
    }
}
