package com.sda.java.podstawy4;

public class PiesTest {

    public static void main(String[] args){

        Pies pies1 = new Pies("Phoebe", "Shiba Inu", "suka");
        Pies pies2 = new Pies("Pikuś", "Kundel", "suka");
        Pies pies3 = new Pies("Tofik", "Kundel", "pies");

        pies1.setWiek(1);
        pies2.setWiek(10);
        pies3.setWiek(3);

        System.out.println(pies1.toString());
        System.out.println(pies2.toString());
        System.out.println(pies3.toString());

        pies1.szczekaj();
        pies2.szczekaj();
        pies3.szczekaj();

        Pies[] psy = { pies1, pies2, pies3 };
        for (Pies pies : psy) {
            pies.szczekaj();
            System.out.println(pies.toString());
        }
    }
}
