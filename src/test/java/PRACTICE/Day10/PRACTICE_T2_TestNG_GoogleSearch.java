package PRACTICE.Day10;

import REUSABLE_LIBRARY.ReusableActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PRACTICE_T2_TestNG_GoogleSearch {
    WebDriver driver;
    @BeforeSuite
    public void SetChromeDriver(){
        driver = ReusableActions.setUpChromeDriver();
    }//END OF SET DRIVER METHOD

    @AfterSuite
    public void quitTheSession(){
        driver.quit();
    }//END OF AFTER SUITE/QUIT METHOD

    @Test(priority = 1)
    public void searchForCar(){
        //NAV TO GOOGLE
        driver.navigate().to("https://google.com");
        //TYPE CARS INTO SEARCH FIELD
        ReusableActions.sendKeysAction(driver, "//*[@name= 'q']", "BMW", "SEARCH FIELD");
        //PRESS SUBMIT
        ReusableActions.submitAction(driver, "//*[@name= 'btnK']", "SUBMIT BUTTON");
    }//END OF TEST 1

    @Test(priority = 2)
    public void captureSearchResult() {
        //CAPTURE AND ISOLATE SEARCH RESULTS AMOUNT
        String result = ReusableActions.getTextAction(driver, "//*[@id= 'result-stats']", "RESULTS SHOWN");
        String[] arrayResult = result.split(" ");
        System.out.println("RESULTS SHOWN: " + arrayResult[1]);
    }
}
