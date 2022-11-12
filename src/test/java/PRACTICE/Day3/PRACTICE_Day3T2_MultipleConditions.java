package PRACTICE.Day3;

public class PRACTICE_Day3T2_MultipleConditions {
    public static void main(String[] args) {
        //declare 3 integers
        int a, b, c;
        a = 5;
        b = 2;
        c = 4;

        //write a multiple conditional statement that covers a + b < c, a + b > c, a + b = c
        if (a + b < c) {
            System.out.println("a & b is less than c");
        } else if (a + b > c) {
            System.out.println("a & b is greater than c");
        } else {
            System.out.println("a & b is equal to c");
        }//end of multi conditionals

    }//end of main
}// end of class
