package com.sda.java.podstawy3;

public class StringManipulation {
    public static void main(String[] args) {

        // tworzenie "podciągów" znaków
        String example = "Dzisiaj mamy sobotę, jest gorąco, ale potem będzie padało.";
        int len = example.length();
        System.out.println(len);
        String sub1 = example.substring(13);
        System.out.println(sub1);
        //String sub2 = example.substring(40, 50);
        System.out.println("Dzisiaj mamy sobotę".substring(4, 10));

        // pobranie elementu z indeksu 0
        char ch0 = example.charAt(36);
        System.out.println(ch0);

        // sprawdzanie pustości
        String s1 = "";
        String s2 = " ";
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());
        System.out.println(s2.isBlank());
        System.out.println(s2.isEmpty());


    }
}
