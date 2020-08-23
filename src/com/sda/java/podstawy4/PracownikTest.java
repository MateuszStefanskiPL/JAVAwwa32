package com.sda.java.podstawy4;

public class PracownikTest {

    public static void main(String[] args){

        Pracownik pracownik1 = new Pracownik();
        System.out.println(pracownik1.stanowisko);

        Pracownik pracownik2 = new Pracownik("Jan", "Kowalski");
        String imie2 = pracownik2.getImie();
        String nazwisko2 = pracownik2.getNazwisko();
        System.out.println(imie2 + " " + nazwisko2);
        pracownik2.setStanowisko("Senior Java Developer");
        pracownik2.setWynagrodzenie(15000);
        System.out.println(pracownik2.getStanowisko() + " " + pracownik2.getWynagrodzenie());

        Pracownik pracownik3 = new Pracownik("Anna", "Nowak", 25,
                "14.08.2020", 15000, "IT Manager");
        System.out.println(pracownik3.getImie());
        System.out.println(pracownik3.getNazwisko());
        System.out.println(pracownik3.getWynagrodzenie());
        pracownik3.podwyzka(0.075f);
        System.out.println(pracownik3.getWynagrodzenie());

        pracownik2.pracuje();
        pracownik3.odpoczywa();

        Pracownik[] pracownicy = {pracownik1, pracownik2, pracownik3};
        for(Pracownik pracownik : pracownicy){
            System.out.println(pracownik.getImie() + " " + pracownik.getNazwisko());
        }

    }
}
