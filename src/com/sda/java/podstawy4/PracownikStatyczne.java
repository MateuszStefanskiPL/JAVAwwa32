package com.sda.java.podstawy4;

public class PracownikStatyczne {

    private static int liczbaPracowników = 0;

    private String imie;

    public PracownikStatyczne(String imie){
        this.imie = imie;
        liczbaPracowników += 1;
    }

    public static int getLiczbaPracowników(){
        return liczbaPracowników;
    }

    public String getImie(){
        return imie;
    }

    public static void setLiczbaPracowników(int liczba){
        PracownikStatyczne.liczbaPracowników = liczba;
    }

    public void setImie(String imie){
        this.imie = imie;
    }

}
