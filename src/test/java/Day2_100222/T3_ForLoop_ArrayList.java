package Day2_100222;

import java.util.ArrayList;

public class T3_ForLoop_ArrayList {
    public static void main(String[] args) {
        //declare and define arrayList for zip code
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("33065");
        zipCode.add("33066");
        zipCode.add("33067");
        zipCode.add("33068");
        zipCode.add("33069");
        zipCode.add("33070");
        zipCode.add("33071");

        //call for loop to print out all zip code values from array list
        //if you want to control the end point by number then put actual number instead of zipCode.size()
        //for array list it uses .size() to get count of list, but linear array uses .length() to get the count of list
        for(int i=0; i < zipCode.size(); i++){
            //print out zip codes automatically
            System.out.println("zipcode: " + zipCode.get(i));
        }//end of loop




    }//end of main
}//end of java class
