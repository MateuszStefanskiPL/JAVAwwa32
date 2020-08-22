package com.sda.java.podstawy3;

public class SubStringTest {

    public static void main(String[] args){

        String tekst = "Dziś zajęcia rozpoczęły się o ";
        String godzina = "9:00";
        StringBuilder sb = new StringBuilder();
        sb.append(tekst);
        sb.append(godzina);
        System.out.println(sb.toString());

        int indexD = tekst.indexOf("D");
        int index = tekst.indexOf("ś");
        String today = tekst.substring(indexD, index+1);
        System.out.println(today);

        System.out.println(tekst.contains("Dziś"));

        System.out.println(tekst.toUpperCase());
        System.out.println(tekst.toLowerCase());

        System.out.println(tekst.charAt(0) + " " + tekst.charAt(tekst.length()-1));

    }

}
