package com.sda.java.podstawy4;

public class Pies {

    private String imie;
    private String rasa;
    private int wiek;
    private String płeć;

    public Pies(String imie, String rasa, String płeć){
        this.imie = imie;
        this.wiek = 0;
        this.rasa = rasa;
        this.płeć = płeć;
    }

    public int getWiek(){
        return wiek;
    }

    public void setWiek(int wiek){
        this.wiek = wiek;
    }

    public void szczekaj(){
        System.out.println("Hau hau!");
    }

    @Override
    public String toString(){
        return imie + ", " + płeć + ", " + rasa + ", " + wiek + " lat";
    }
}
