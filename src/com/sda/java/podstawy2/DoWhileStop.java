package com.sda.java.podstawy2;

import java.util.Scanner;

public class DoWhileStop {

    public static void main(String[] args){
        // deklaracja i inicjalizacja słowa kluczowego
        String keyword = "STOP";
        Scanner scanner = new Scanner(System.in);
        String userWord = "";
        do {
            userWord = scanner.nextLine();
            System.out.println(userWord);
        } while(!userWord.equals(keyword));
        System.out.println("KONIEC");
    }

}
