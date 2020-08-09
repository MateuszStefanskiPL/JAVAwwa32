package com.sda.java.podstawy2;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        // wpisanie wartości do tablicy
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        // policz sumę elementów w tablicy array
        int sum = 0;
        for(int elem : array){
            sum += elem;
        }
        System.out.println("suma " + sum);
        // policz średnią
        float avg = sum / ((float)array.length);
        System.out.println("średnia " + avg);
        // wypisz największą wartość z tablicy*
        int max = 0;
        for (int elem : array){
            if (elem > max) {
                max = elem;
            }
        }
        System.out.println("wartość maksymalna " + max);

        for(int elem : array){
            if(elem % 2 == 0){
                System.out.println(elem);
            }
        }
    }
}
