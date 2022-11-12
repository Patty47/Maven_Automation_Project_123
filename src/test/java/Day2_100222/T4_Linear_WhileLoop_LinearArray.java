package Day2_100222;

public class T4_Linear_WhileLoop_LinearArray {
    public static void main(String[] args) {
        //you can also use arraylist for while loop as well
        //declare and define linear array for street numbers
        int[] streetNumber = new int[]{111, 333, 444, 555, 666, 777};
        //iterate through all street numbers by while loop
        //set the initializer
        int i = 0;
        //set the condition of while loop
        //linear array gets the count by using .length command
        while(i < streetNumber.length){
            System.out.println("street number: " + streetNumber[i]);
            //incrementation goes at end of while loop
            i++;


        }//end of while loop
    }//end of main
}//end of class
