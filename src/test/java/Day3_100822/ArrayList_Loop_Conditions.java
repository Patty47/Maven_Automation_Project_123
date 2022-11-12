package Day3_100822;

import java.util.ArrayList;

public class ArrayList_Loop_Conditions {
    public static void main(String[] args) {
        //<> refers to anchor
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("Bangladesh");
        countries.add("Australia");
        countries.add("India");

        //using for loop to iterate thru countries list and print out only USA and Australia

        for (int i = 0; i < countries.size(); i++){

            //use two equal signs to compare left and right sides
            //one equal sign is to declare a value to a variable
            if (countries.get(i) == "USA"){
            System.out.println("Country is USA. And index is " + i);
        }   else if (countries.get(i) == "Australia"){
                System.out.println("Country is Australia. And index is " + i);
            }

            //using OR(||) operator you can write both/multiple conditions on one if statement
            // " /* " is used to mute a block of code

        /*
            if (countries.get(i) == "USA" || countries.get(i) == "Australia"){
                System.out.println("Country is " + countries.get(i) + " and index is " + i);
            }*/

        }
}}
