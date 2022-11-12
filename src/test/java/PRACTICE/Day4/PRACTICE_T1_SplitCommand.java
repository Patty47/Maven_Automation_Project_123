package PRACTICE.Day4;

public class PRACTICE_T1_SplitCommand {
    public static void main(String[] args) {
        //declare a string variable
        String message = "My name is Patty";

        //extract out patty from message
        //call a split message using string array
        String[] splitMessage = message.split(" ");
        System.out.println("Name is " + splitMessage[3]);

        //extract a single character from a message
        //call a split message using string array
        String message2 = "abc";

        String[] splitMessage2 = message2.split("");
        System.out.println("result " + splitMessage2[3]);

    }//end of main
}//end of class
