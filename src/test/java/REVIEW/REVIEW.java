package REVIEW;

public class REVIEW {
    public static void main(String[] args) {
        //define automation string variable
        String subjectLine = "Automation_AI05";

        //as a professpr, i would like to see only the action item number
        //might be useful to use split method
        //how
        //expected output should be 05

        String[] splitSubjectLine = subjectLine.split("");
        System.out.println(splitSubjectLine[13] + splitSubjectLine[14]);
    }
}
