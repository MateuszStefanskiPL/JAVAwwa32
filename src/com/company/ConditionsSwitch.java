package com.company;

import java.util.Scanner;

public class ConditionsSwitch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int value = in.nextInt();

        switch(value){
            case 0: {
                System.out.println("*");
                break;
            }
            case 1: {
                System.out.println("!");
                break;
            }
            case 2: {
                System.out.println("#");
                break;
            }
            default: {
                System.out.println("default");
                break;
            }
        }

          /*while(value != 0) {
            System.out.println("value");
            value = in.nextInt();
        }*/
    }
}
