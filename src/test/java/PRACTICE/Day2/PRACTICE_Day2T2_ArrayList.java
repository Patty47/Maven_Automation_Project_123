package PRACTICE.Day2;

import java.util.ArrayList;

public class PRACTICE_Day2T2_ArrayList {
    public static void main(String[] args) {
        //declare and define arraylist of countries
        ArrayList<String> countries = new ArrayList<>();

        //add values
        countries.add("USA");
        countries.add("India");
        countries.add("China");
        countries.add("PUERTO RICO:RELOADED");

        //PRINT PUERTO RICO RELOADED
        System.out.println("Country: " + countries.get(3));

        //PRINT AMOUNT OF COUNTRIES IN LIST
        System.out.println("# of Countries: " + countries.size());

        //add an integer arrayline of street numbers
        ArrayList<Integer> streetNumbers = new ArrayList<>();

        //add define values
        streetNumbers.add(3112);
        streetNumbers.add(3113);
        streetNumbers.add(3114);
        streetNumbers.add(3115);

        //PRINT CHINA AND STREET #
        System.out.println("Country: " + countries.get(2) + " " + "Street #: " + streetNumbers.get(0));
    }
}
