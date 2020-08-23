package com.sda.java.podstawy4;

public class Kalkulator {

    public int dodaj(int a, int b){ return a + b; }

    public int dodaj(int a, int b, int c){ return a + b + c; }

    public double dodaj(double a, double b){ return a + b; }

    public double dodaj(double a, double b, double c){ return a + b + c; }

    public int odejmij(int a, int b){ return a - b; }

    public double odejmij(double a, double b){ return a - b; }

    public int mnóż(int a, int b){ return a * b; }

    public int mnóż(int a, int b, int c){ return a * b * c; }

    public double mnóż(double a, double b){ return a * b; }

    public double mnóż(double a, double b, double c){ return a * b * c; }

    public double dziel(int a, int b){
        if (b == 0){
            System.out.println("Nie dziel przez zero!");
            return -1;
        }
        return a/b;
    }

    public double dziel(double a, double b){
        if (b == 0.0f){
            System.out.println("Nie dziel przez zero!");
            return -1;
        }
        return a/b;
    }
}
