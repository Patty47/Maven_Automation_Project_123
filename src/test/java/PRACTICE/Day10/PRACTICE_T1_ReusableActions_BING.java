package PRACTICE.Day10;

import REUSABLE_LIBRARY.ReusableActions;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.*;

public class PRACTICE_T1_ReusableActions_BING {
    public static void main(String[] args) throws InterruptedException {
        //CALL REUSABLE METHOD FOR SETTING UP WEBDRIVER
        WebDriver driver = ReusableActions.setUpChromeDriver();

        //NAV TO BING.COM
       driver.navigate().to("https://bing.com");
       sleep(3000);
        //ENTER KEYWORD INTO SEARCH FIELD USING REUSABLE METHOD
        ReusableActions.sendKeysAction(driver, "//*[@name= 'q']", "Soccer", "Search Field");

        //CLICK ON SEARCH BUTTON USING REUSABLE ACTIONS
        ReusableActions.clickAction(driver, "//*[@id= 'search_icon']", "Search Button");

        //CAPTURE AND ISOLATE RESULT #
        String result = ReusableActions.getTextAction(driver, "//*[@class= 'sb_count']", "Search Results Amount");
        System.out.println("Results Shown: " + result);
    }//END OF MAIN
}//END OF CLASS
