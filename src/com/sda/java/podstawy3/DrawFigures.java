package com.sda.java.podstawy3;

public class DrawFigures {

    public static void drawSquare(int size, String sign){
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                if(x == 0 || x == size-1 || y == 0 || y == size-1){
                    System.out.print(sign);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int width, int height, String sign){
        for(int x = 0; x < height; x++){
            for(int y = 0; y < width; y++){
                if(x == 0 || x == height-1 || y == 0 || y == width-1){
                    System.out.print(sign);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawL(int size, String sign){
        // nasz x jest tak naprawdę y (zamienione indeksy)
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                if(x == size-1 || y == 0){
                    System.out.print(sign);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int size, String sign){
        // nasz x jest tak naprawdę y (zamienione indeksy)
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                if(x == size-1 || y == 0 || x == y){
                    System.out.print(sign);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawSquareWithArray(int size, String sign){
        String [][] array = new String[size][size];
        // wpisywanie elementów w tablicę
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                if(x == 0 || x == size-1 || y == 0 || y == size-1){
                    array[x][y] = sign;
                } else {
                    array[x][y] = " ";
                }
            }
        }
        // wypisywanie tablicy na ekran
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        if(args.length <= 0) {
            System.out.println("Nie podano argumentów");
            System.exit(0);
        }
        String figure = args[0];
        System.out.println("Wybrano " + figure);
        String sign = args[1];

        if (figure.equals("kwadrat")){
            drawSquare(4, sign);
        } else if (figure.equals("prostokat")) {
            drawRectangle(10, 4, sign);
        } else if (figure.equals("L")) {
            drawL(4, sign);
        } else if (figure.equals("trojkat")) {
            drawTriangle(6, sign);
        } else if (figure.equals("tablica")) {
            drawSquareWithArray(6, sign);
        }
    }
}
