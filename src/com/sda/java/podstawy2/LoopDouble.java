package com.sda.java.podstawy2;

import java.util.Scanner;

public class LoopDouble {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sign = "*";
        int size = scanner.nextInt(); // pierwszy bok
        //int size2 = scanner.nextInt(); // drugi bok
        int size2 = 2*size; // dwukrotnie szerszy
        for(int i = 0; i < size; i++) { // pętla zewnętrzna
            for(int j = 0; j < size2; j++){ // pętla wewnętrzna
                System.out.print(sign); // wypisywanie obok siebie
            }
            System.out.println(""); // wypiwanie znaku nowej linii
        }
    }
}
