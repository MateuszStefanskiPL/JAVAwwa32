package com.sda.java.podstawy3;

import java.util.Arrays;

public class UpperCase {

    public static void main(String[] args){

        String[] lower = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
        "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "w", "y", "z"};
        String[] upper = new String[lower.length]; // A B C D
        for(int i = 0; i < lower.length; i++){
            upper[i] = lower[i].toUpperCase();
        }

        String test = "Test Mojego Algorytmu";
        //Arrays.asList(test);
        char[] array = test.toCharArray();
        for(int i = 0; i < array.length; i++){
            if(Arrays.asList(lower).contains(String.valueOf(array[i]))){
                //System.out.println(array[i]);
                int index = Arrays.asList(lower).indexOf(String.valueOf(array[i]));
                System.out.print(upper[index]);
            } else {
                System.out.print(array[i]);
            }
        }
    }
}
