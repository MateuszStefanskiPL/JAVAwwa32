package com.sda.java.podstawy4;

public class RoomTest {

    public static void main(String[] args){

        Room room1 = new Room(3.0, 4.0, 5.5);
        room1.printArea();
        room1.printVolume();

        Room room2 = new Room(4.0, 5.5);
        room2.printArea();
        room2.printVolume();

        System.out.println(room1.toString());
        System.out.println(room2.toString());
    }

}
