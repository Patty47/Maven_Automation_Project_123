package Day4_100922;

public class T1_SplitCommand {
    public static void main(String[] args) {
        //declare a string variable
        String message = "My name is Patty";
        //extract out Patty from string and print it
        //call split message by using string array
        String[] splitMessage = message.split(" ");
        System.out.println("Name is " + splitMessage[3]);

        //extracting each character from a string
        String message2 = "abc";
        //extract out C from string and print it
        //call split message by using string array
        String[] splitMessage2 = message2.split("");
        System.out.println("result " + splitMessage2[2]);
    }//end of main
}//end of class
