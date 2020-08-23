package com.sda.java.podstawy4;

public class Pracownik {

    private String imie; // <- this.imie
    private String nazwisko;
    private int wiek;
    private String dataZatrudnienia;
    private long wynagrodzenie;
    public String stanowisko;

    public Pracownik() {
        System.out.println("Konstruktor domyślny bezparametrowy.");
    }

    public Pracownik(String imie, String naz) {
        this.imie = imie;
        nazwisko = naz;
    }

    public Pracownik(String name){
        imie = name;
    }

    public Pracownik(String imie, String nazwisko, int wiek,
                     String data, long pensja, String stanowisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.dataZatrudnienia = data;
        this.wynagrodzenie = pensja;
        this.stanowisko = stanowisko;
    }

    public void podwyzka(float procent){
        this.wynagrodzenie = (long)(this.wynagrodzenie * (1 + procent));
    }

    public void pracuje(){
        System.out.println(imie + " " + nazwisko + " pracuje...");
    }

    public void odpoczywa(){
        System.out.println(imie + " " + nazwisko + " odpoczywa...");
    }

    // Gettery
    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public String getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public long getWynagrodzenie() {
        return wynagrodzenie;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public String getImie() {
        return imie;
    }

    // Settery
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setDataZatrudnienia(String dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public void setWynagrodzenie(long wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
}
