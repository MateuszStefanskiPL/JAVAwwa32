package com.sda.java.podstawy1;

import java.util.Scanner;

public class ConditionsString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        if(name.equals("gwiazdka")){
            System.out.println("*");
        } else if(name.equals("małpa")) {
            System.out.println("@");
        } else {
            System.out.println("Invalid value!");
        }
    }
}
