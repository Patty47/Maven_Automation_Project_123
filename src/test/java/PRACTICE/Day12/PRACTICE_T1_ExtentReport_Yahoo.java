package PRACTICE.Day12;

import REUSABLE_LIBRARY.ReusableActions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class PRACTICE_T1_ExtentReport_Yahoo {
    //WEBDRIVER DRIVER
    WebDriver driver;

    //INITIALIZE EXTENTREPORTS
    ExtentReports reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html", true);
    //INITIALIZE EXTENT TEST LOGGER
    ExtentTest logger;

    @BeforeSuite
    public void SetChromeDriver() {
        driver = ReusableActions.setUpChromeDriver();
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html", true);
    }//END OF BEFORE SUITE

    @AfterSuite
    public void QuitDriver() {
        driver.quit();
        reports.flush();
    }//END OF AFTER SUITE

    @Test(priority = 1)
    public void TC001_VerifySignedInOptionIsChecked() throws InterruptedException {
        //SET NAME OF TEST CASE TO REPORT
        logger = reports.startTest("TC001_VerifySignedInOptionIsChecked");

        //NAV TO YAHOO
        driver.navigate().to("https://yahoo.com");
        //SLEEP
        sleep(3000);
        //CLICK SIGN IN BUTTON
        driver.findElement(By.xpath("//*[@class= '_yb_1933e']")).click();
        //SET PASS LOGGER
        logger.log(LogStatus.PASS, "Successfully clicked sign in button");
        //VERIFY IF STAY SIGNED IN IS CHECKED
        boolean isStaySignedInBoxChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        System.out.println("Checkbox check status is: " + isStaySignedInBoxChecked);
        logger.log(LogStatus.INFO, "Checkbox check status is: " + isStaySignedInBoxChecked);
        //END LOGGER FOR TEST 1
        reports.endTest(logger);
    }//END OF TEST 1

    @Test(dependsOnMethods = "TC001_VerifySignedInOptionIsChecked")
    public void TC002_verifySignedInOptionIsUnchecked() {
        //SET NAME OF TEST CASE TO REPORT
        logger = reports.startTest("TC002_verifySignedInOptionIsUnchecked");
        //CLICK CHECK BOX TO UNCHECK IT
        driver.findElement(By.xpath("//*[@for= 'persistent']")).click();
        logger.log(LogStatus.PASS, "Successfully unchecked box");
        //VERIFY SIGNED IN OPTION IS UNCHECKED
        boolean isStaySignedInBoxUnchecked = driver.findElement(By.xpath("//*[@for= 'persistent']")).isSelected();
        System.out.println("Checkbox check status is " + isStaySignedInBoxUnchecked);
        logger.log(LogStatus.INFO,"Checkbox check status is " + isStaySignedInBoxUnchecked);
    }//END OF TEST 2

}
