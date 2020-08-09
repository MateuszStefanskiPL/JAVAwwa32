package com.sda.java.podstawy2;

public class Names {

    public static void main(String[] args){
        String[] names = {"Paula", "Łukasz", "Jan", "Paweł", "Faustyna"};
        String allNames = "";
        for (String name : names) {
            if(name.length() < 6) {
                allNames += name + ", ";
            }
            if(name.endsWith("a")) { // czy słowo kończy się na a
                allNames += name + ", ";
            }
            if(name.startsWith("P") || name.startsWith("p")) { // czy słowo zaczyna się na p
                allNames += name + ", ";
            }
            if(name.toLowerCase().startsWith("p")) { // czy słowo zaczyna się na p
                allNames += name + ", ";
            }
        }
        System.out.println(allNames);
        String newAllNames = allNames.substring(0, allNames.length()-2);
        System.out.println(newAllNames);
    }
}
