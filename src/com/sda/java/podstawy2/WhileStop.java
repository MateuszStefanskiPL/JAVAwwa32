package com.sda.java.podstawy2;

import java.util.Scanner;

public class WhileStop {

    public static void main(String[] args){
        // deklaracja i inicjalizacja słowa kluczowego
        String keyword = "STOP";
        // scanner
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();
        // pętla while
        while(!userWord.equals(keyword)){
            System.out.println(userWord);
            userWord = scanner.nextLine();
        }
        System.out.println("KONIEC");
    }
}
