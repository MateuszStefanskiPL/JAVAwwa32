package com.sda.java.podstawy4;

public class KalkulatorStatyczne {

    public static int dodaj(int a, int b){
        return a + b;
    }

    public static int odejmij(int a, int b){
        return a - b;
    }

    public static int pomnóż(int a, int b){
        return a * b;
    }

    public static double podziel(int a, int b){
        if(b == 0){
            System.out.println("Nie dziel przez zero!");
            return -1;
        }
        return a / ((double) b);
    }

    public static int reszta(int a, int b){
        if(b == 0){
            System.out.println("Nie dziel przez zero!");
            return -1;
        }
        return a % b;
    }

}
