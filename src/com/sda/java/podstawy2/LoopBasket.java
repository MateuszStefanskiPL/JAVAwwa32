package com.sda.java.podstawy2;

import java.util.Scanner;

public class LoopBasket {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String products = "";
        String product = "";
        for(int i = 0; i < 3; i++){
            System.out.println("Proszę wprowadź nazwę produktu.");
            product = scanner.nextLine();
            System.out.println("Dodano do koszyka: " + product);
            products += " " + product;
        }
        System.out.println(product);
        System.out.println(products);
    }
}
