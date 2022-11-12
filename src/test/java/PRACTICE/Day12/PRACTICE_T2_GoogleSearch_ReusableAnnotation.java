package PRACTICE.Day12;

import REUSABLE_LIBRARY.ReusableAction_Annotations;
import REUSABLE_LIBRARY.ReusableAction_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class PRACTICE_T2_GoogleSearch_ReusableAnnotation extends ReusableAction_Annotations {
    @Test
    public void searchForBMW() {
        //NAV TO GOOGLE
        driver.navigate().to("https://google.com");
        //SEARCH FOR BMW
        ReusableAction_Loggers.sendKeysAction(driver, "//*[@name= 'q']", "BMW", logger, "SEARCH FIELD");
        //HIT SUBMIT
        ReusableAction_Loggers.submitAction(driver, "//*[@name= 'btnK']", logger, "SUBMIT BUTTON");
    }//END TEST 1

    @Test(dependsOnMethods = "searchForBMW")
    public void captureSearchNumber() {
        //CAPTURE SEARCH RESULTS
        String result = ReusableAction_Loggers.getTextAction(driver, "//*[@id= 'result-stats']", logger, "SEARCH RESULTS AMT");
        String[] arrayResult = result.split(" ");
        //PRINT BACK TO HTML REPORT USING INFO
        logger.log(LogStatus.INFO, "Search Results amount for BMW is: " + arrayResult[1]);
    }//END OF TEST 2
}
