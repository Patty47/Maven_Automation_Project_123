package ACTION_ITEMS;

import java.util.ArrayList;

public class ACTION_ITEM1_part_1 {
    public static void main(String[] args) {
        //declare and define arraylist for country & countrycode
        ArrayList<String> country = new ArrayList<>();
        country.add("USA");
        country.add("Canada");
        country.add("Mexico");
        country.add("SWEDEN");

        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(201);
        countryCode.add(202);
        countryCode.add(203);
        countryCode.add(204);

        //call for loop to print country and countryCode
        for(int i = 0; i < country.size(); i++){
            System.out.println("My Country is " + country.get(i) + " " + "and my Country Code is " + countryCode.get(i));
        }//end of loop
    }//end of main
}//end of class
