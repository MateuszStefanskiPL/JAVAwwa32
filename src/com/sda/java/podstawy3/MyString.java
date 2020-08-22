package com.sda.java.podstawy3;

public class MyString {

    public static void main(String[] args){

        // konkatenacja (łączenie)
        String name = "Paula";
        String surname = new String("Kochańska");
        System.out.println(name + " " + surname);

        // porównanie czasów
        classic("a", 100000);
        builder("a", 100000);
    }

    public static void classic(String character, int count){
        String testString = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < count; i++){
            testString += character;
        }
        long endTime = System.nanoTime();
        System.out.println("Czas trwania (klasycznie): " + (endTime-startTime));
    }

    public static void builder(String character, int count){
        StringBuilder builder = new StringBuilder(); // tu różnica
        long startTime = System.nanoTime();
        for (int i = 0; i < count; i++){
            builder.append(character); // tu różnica
        }
        long endTime = System.nanoTime();
        System.out.println("Czas trwania (builder): " + (endTime-startTime));
    }

}
