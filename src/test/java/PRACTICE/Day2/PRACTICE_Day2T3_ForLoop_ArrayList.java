package PRACTICE.Day2;

import java.util.ArrayList;

public class PRACTICE_Day2T3_ForLoop_ArrayList {
    public static void main(String[] args) {
        //declare and define arraylist of zipcodes
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("33065");
        zipCode.add("33066");
        zipCode.add("33067");
        zipCode.add("33068");
        zipCode.add("33069");
        zipCode.add("33070");
        zipCode.add("33071");

        //call for loop to print all zip codes
        for (int i = 0; i < zipCode.size(); i++){
            // PRINT ALL ZIP CODES
            System.out.println("Zip Code: " + zipCode.get(3));
        }//end of loop

    }
}
