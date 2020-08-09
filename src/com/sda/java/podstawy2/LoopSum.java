package com.sda.java.podstawy2;

import java.util.Scanner;

public class LoopSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Proszę wprowadź liczbę.");
            int element = scanner.nextInt();
            sum += element;
            //sum = sum + element;
        }
        System.out.println(sum);
    }
}
