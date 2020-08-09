package com.sda.java.podstawy2;

public class EmptySquare {

    public static void main(String[] args){
        String sign = "* ";
        int size = 4;

        for(int x = 0; x <= size; x++){
            for(int y = 0; y <= size; y++){
                if(x == 0 || x == size || y == 0 || y == size){
                    System.out.print(sign);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
