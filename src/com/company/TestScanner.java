package com.company;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*System.out.println("Jak masz na imię?");
        String name = in.nextLine();
        System.out.println("Ile masz lat?");
        int age = in.nextInt();
        System.out.println("Cześć " + name + ", masz " + age + " lat.");

        System.out.println("Podaj dwie liczby");
        int val1 = in.nextInt();
        int val2 = in.nextInt();
        System.out.println(val1+val2);*/

        System.out.println("Podaj liczby po przecinku");
        String input = in.nextLine();
        String numbers[] = input.split(",");
        //System.out.println(numbers);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            int currentValue = Integer.parseInt(numbers[i].strip());
            sum += currentValue;
        }
        System.out.println(sum);
    }
}
