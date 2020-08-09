package com.sda.java.podstawy2;

import java.util.Random;

public class RandomWhile {

    public static void main(String[] args){
        Random random = new Random();
        int i = -1;
        while(i % 5 != 0){
            i = random.nextInt(1000);
            System.out.println("Aktualna wartość to: " + i);
        }
    }
}
