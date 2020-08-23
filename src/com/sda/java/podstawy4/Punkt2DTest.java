package com.sda.java.podstawy4;

public class Punkt2DTest {

    public static void main(String[] args){

        Punkt2D punkt1 = new Punkt2D(1, 1);
        Punkt2D punkt2 = new Punkt2D(1, 4);

        System.out.println(punkt1.getX() + " " + punkt1.getY());
        System.out.println(punkt2.getX() + " " + punkt2.getY());

        double d1 = punkt1.distance(punkt1, punkt2);
        double d2 = punkt1.distance(new Punkt2D(0,0), new Punkt2D(3,4));
        System.out.println(d1);
        System.out.println(d2);

        System.out.println(punkt1.toString());
        System.out.println(punkt2.toString());
        System.out.println(new Punkt2D(3,4).toString());

    }

}
