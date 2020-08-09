package com.sda.java.podstawy2;

public class Array1D {

    public static void main(String[] args){

        int[] intArray = new int[10];
        int[] intArray2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i = 0; i < intArray2.length; i++){ // klasyczny for
            System.out.println(intArray2[i]);
        }
        // jak odwołać się do ostatniego elememtu w tablicy
        int last = intArray2[intArray2.length-1];

        for(int elem : intArray2){ // pętla for-each
            System.out.println(elem);
        }

    }
}
