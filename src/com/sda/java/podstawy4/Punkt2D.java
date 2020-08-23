package com.sda.java.podstawy4;

public class Punkt2D {

    private int x;
    private int y;

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(Punkt2D p1, Punkt2D p2){
        double d = Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2)
                           + Math.pow((p1.getY()-p2.getY()), 2));
        return d;
    }

    @Override
    public String toString(){
        String text = "Punkt ma współrzędne x=" + this.x + " y=" + this.y;
        return text;
    }
}
