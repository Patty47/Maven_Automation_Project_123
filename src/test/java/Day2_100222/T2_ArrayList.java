package Day2_100222;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {
        //declare and define arraylist of countries
        ArrayList<String> countries = new ArrayList<>();
        //now add values of countries array
        countries.add("USA");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("Canada");
        countries.add("Singapore");

        //print USA from countries list
        System.out.println("Countries value: " + countries.get(0));
        //get count of the countries list
        System.out.println("Countries count:" + countries.size());

        //call an integer arrayList for street number
        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(3112);
        streetNumber.add(3114);
        streetNumber.add(3116);
        streetNumber.add(3118);
        System.out.println("First street number " + streetNumber.get(0));

    }//end of main
}//end of class
