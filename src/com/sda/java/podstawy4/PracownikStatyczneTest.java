package com.sda.java.podstawy4;

public class PracownikStatyczneTest {

    public static void main(String[] args){

        int liczbaPracowników = PracownikStatyczne.getLiczbaPracowników();
        System.out.println("Liczba pracowników: " + liczbaPracowników);

        PracownikStatyczne p1 = new PracownikStatyczne("Michał");
        System.out.println("Liczba pracowników: " + PracownikStatyczne.getLiczbaPracowników());

        PracownikStatyczne.setLiczbaPracowników(10);
        PracownikStatyczne p2 = new PracownikStatyczne("Zenek");
        System.out.println("Liczba pracowników: " + PracownikStatyczne.getLiczbaPracowników());

    }

}
