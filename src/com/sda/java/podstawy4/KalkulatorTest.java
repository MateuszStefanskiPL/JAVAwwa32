package com.sda.java.podstawy4;

public class KalkulatorTest {

    public static void main(String[] args){

        Kalkulator kalkulator = new Kalkulator();

        System.out.println(kalkulator.dodaj(1,2));
        System.out.println(kalkulator.dodaj(1.0f,2.0f));

        System.out.println(kalkulator.odejmij(2, 1));
        System.out.println(kalkulator.odejmij(2.0f, 1.0f));

        System.out.println(kalkulator.mnóż(2, 3));
        System.out.println(kalkulator.mnóż(2.0f, 3.0f));

        System.out.println(kalkulator.dziel(2, 0));
        System.out.println(kalkulator.dziel(2.0f, 0.0f));

        System.out.println(kalkulator.dziel(2, 2));
        System.out.println(kalkulator.dziel(2.0f, 2.0f));
    }

}
