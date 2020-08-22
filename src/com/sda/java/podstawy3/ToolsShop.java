package com.sda.java.podstawy3;

import java.util.Scanner;

public class ToolsShop {

    public static void main(String[] args){

        String[] tools = {args[1], args[2], args[3]};
        //Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        String name = args[0];

        System.out.println("Witaj " + name + "! W naszej ofercie mamy:");
        for (String item : tools){
            System.out.println("- " + item);
        }

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        String bucket = "";

        do {
            System.out.println("Co chcesz kupić? Wpisz koniec, aby zakończyć.");
            choice = scanner.nextLine();
            switch (choice) {
                case "kombinerki": {
                    System.out.println("Dodano " + choice + " do koszyka");
                    bucket += choice + " ";
                    break;
                }
                case "śrubokręt": {
                    System.out.println("Dodano " + choice + " do koszyka");
                    bucket += choice + " ";
                    break;
                }
                case "nożyczki": {
                    System.out.println("Dodano " + choice + " do koszyka");
                    bucket += choice + " ";
                    break;
                }
                case "koniec" : {
                    break;
                }
                default: {
                    System.out.println("Nie ma takiego itemka");
                }
            }
        } while(!choice.equals("koniec"));

        System.out.println("Twój koszyk: " + bucket);

    }

}
