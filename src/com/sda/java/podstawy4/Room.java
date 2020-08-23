package com.sda.java.podstawy4;

public class Room {

    private double height;
    private double width;
    private double length;

    private double area;
    private double volume;

    public Room(double h, double w, double l) {
        this.height = h;
        this.width = w;
        this.length = l;
    }

    public Room(double w, double l) {
        this.height = 2.4;
        this.width = w;
        this.length = l;
    }

    public double calculateArea() {
        area = this.width * this.length;
        return area;
    }

    public double calculateVolume() {
        volume = calculateArea() * this.height;
        return volume;
    }

    public void printArea() {
        System.out.println(calculateArea());
    }

    public void printVolume() {
        System.out.println(calculateVolume());
    }

    @Override
    public String toString(){
        return area + "m2, " + volume + "m3";
    }

}
