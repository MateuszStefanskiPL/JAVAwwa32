package com.sda.java.podstawy4;

public class KalkulatorStatyczneTest {

    public static void main(String[] args){

        double a = KalkulatorStatyczne.podziel(12, 7);
        System.out.println(a);
        double b = ((int)(a*100))/((double)100);
        Math.round(a);
        System.out.println(b);

        System.out.println(String.format("%.2f", a));

    }
}
