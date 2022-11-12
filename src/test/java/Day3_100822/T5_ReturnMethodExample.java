package Day3_100822;

public class T5_ReturnMethodExample {
    public static void main(String[] args) {
        /*int value = ReusableClass.returnTwoAddNumbers(5, 2);
        System.out.println("New value is " + value);
         */

        int value = T3_ReusableClass.returnTwoAddNumbers(5, 2);
        System.out.println("New value is " + (value+3));
    }//end of main
}//end of java class
