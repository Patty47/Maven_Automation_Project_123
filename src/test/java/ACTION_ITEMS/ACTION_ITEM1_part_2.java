package ACTION_ITEMS;

public class ACTION_ITEM1_part_2 {
    public static void main(String[] args) {
        //declare and define linear array of region and area code
        String[] region;

        //define region
        region = new String[] {"USA", "Mexico", "New Zealand", "United Kingdom"};

        //define areaCode
        int[] areaCode = new int[]{+1, +52, +64, +44};
        int i = 0;

        while(i < areaCode.length){
            System.out.println("My region is " + region[i] + " and my area code is " + " +" + areaCode[i]);
            i++;
        }//end of loop


        //print
    }//end of main
}//end of class
