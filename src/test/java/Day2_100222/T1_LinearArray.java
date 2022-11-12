package Day2_100222;

public class T1_LinearArray {
    public static void main(String[] args) {
        //declare string variable
        String[] zipCode, streetNumber;
        //defining zipCodes
        zipCode = new String[] {"11218", "11222", "33065", "21212"};
        //define streetNumber
        streetNumber = new String[] {"3112", "3114", "3116", "3118"};
        //print value from zipCode array. always starts from 0
        System.out.println("zipCode: " + zipCode[3] + ", " + zipCode[2] + " & street number: " + streetNumber[3]);
    }//end of main
}//end of class
