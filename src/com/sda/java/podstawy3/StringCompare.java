package com.sda.java.podstawy3;

public class StringCompare {

    public static void main(String[] args) {

        String s1 = "Napis";
        String s2 = "Napis";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("Napis");
        String s4 = new String("Napis");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }

}
