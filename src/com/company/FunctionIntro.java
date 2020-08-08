package com.company;

public class FunctionIntro {

    public static void main(String[] args) {
        System.out.println("Jestem w metodzie main");
        /*test1();
        int value = test2();
        System.out.println(test2());
        System.out.println(value);
        System.out.println(test3());
        System.out.println(test4());*/

        int value = test5(1, 2, "test");

    }

    public static int test5(int value1, int value2, String name){
        System.out.println(name);
        return value1+value2;
    }

    public static int test5(int value2, String name){
        System.out.println(name);
        return value2;
    }

    public static void test1(){
        System.out.println("Test1");
    }

    public static int test2(){
        return 42;
    }

    public static boolean test3(){
        return false;
    }

    public static String test4(){
        return "test";
    }


}
