package com.company;

public class Main {

    public static void main(String[] args) {
        int val1 = 192;
        int val2 = 168;
        int val3 = 1;
        int val4 = 10;

        int[] values = {val1, val2, 1, val4};
        String finalString = "";
        for (int i = 0; i < values.length; i++){
            finalString += String.format("%02x:", values[i]);
        }
        finalString = finalString.substring(0, finalString.length()-1);
        System.out.println(finalString.toUpperCase());

        String finalString2 = "";
        for(int value : values){
            if(value == values[values.length-1]) {
                finalString2 += String.format("%02x", value);
            } else {
                finalString2 += String.format("%02x:", value);
            }
        }
        System.out.println(finalString2.toUpperCase());

        //System.out.println(String.format("%02x:%02x:%02x:%02x".toUpperCase(), val1, val2, val3, val4));
    }
}
