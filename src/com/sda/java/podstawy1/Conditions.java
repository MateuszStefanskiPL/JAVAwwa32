package com.sda.java.podstawy1;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if(number == 0){
            System.out.println("!");
        } else if(number == 1) {
            System.out.println("@");
        } else if(number == 2) {
            System.out.println("#");
        } else if(number == 3) {
            System.out.println("$");
        } else if(number == 4) {
            System.out.println("%");
        } else if(number == 5) {
            System.out.println("^");
        } else if(number == 6) {
            System.out.println("&");
        } else if(number == 7) {
            System.out.println("*");
        } else if(number == 8) {
            System.out.println(":");
        } else if(number == 9) {
            System.out.println(";");
        } else {
            System.out.println("Invalid value!");
        }
    }
}
