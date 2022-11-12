package ACTION_ITEMS;

import REUSABLE_LIBRARY.ReusableAction_Annotations;
import REUSABLE_LIBRARY.ReusableActions;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class ACTION_ITEM6_Savings extends ReusableAction_Annotations {
    @Test
    public void confirmPresenceOfSavingsAccountOptions() throws InterruptedException {
        //SET NAME OF TEST CASE TO REPORT
        logger = reports.startTest("confirmPresenceOfSavingsAccountOptions");

        //NAV TO ALLY
        driver.navigate().to("https://ally.com");
        sleep(3000);
        //HOVER MOUSE OVER CHECKING AND SAVINGS TAB AND CLICK IT
        ReusableActions.mouseHover(driver, "//*[contains(text(), 'Checking & Savings')]", "CHECKING AND SAVINGS TAB");
        sleep(3000);
        ReusableActions.clickAction(driver, "//*[contains(text(), 'Checking & Savings')]", "CHECKING AND SAVINGS TAB");
        sleep(3000);
        //CLICK "OPEN ACCOUNT"
        ReusableActions.clickAction(driver, "//*[text()= ' Compare Savings Accounts ']", "COMPARE SAVINGS BUTTON");
        //LOG PASS
        logger.log(LogStatus.PASS, "SUCCESSFULLY CLICKED COMPARE SAVINGS ACCOUNT");

        //VERIFY PRESENCE OF MULTIPLE SAVINGS OPTIONS
        boolean isOnlineSavingsAccountOptionVisible = driver.findElement(By.xpath("//*[text()= 'Online Savings']")).isDisplayed();
        boolean isMoneyMarketSavingsAccountOptionVisible = driver.findElement(By.xpath("//*[text()= 'Money Market']")).isDisplayed();
        System.out.println("ONLINE SAVINGS VISIBILITY STATUS IS: " + isOnlineSavingsAccountOptionVisible);
        logger.log(LogStatus.INFO, "ONLINE SAVINGS VISIBILITY STATUS IS: " + isOnlineSavingsAccountOptionVisible);
        System.out.println("MONEY MARKET SAVINGS VISIBILITY STATUS IS: " + isMoneyMarketSavingsAccountOptionVisible);
        logger.log(LogStatus.INFO, "MONEY MARKET SAVINGS VISIBILITY STATUS IS: " + isMoneyMarketSavingsAccountOptionVisible);

        //END LOGGER FOR TEST 1
        reports.endTest(logger);
    }//END OF TEST 1

    @Test(priority = 2)
    public void atmLocatorForLoop() throws InterruptedException {
        //SET NAME
        reports.startTest("atmLocatorForLoop");
        //DECLARE AND DEFINE ARRAY
        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("33065");
        zipCodes.add("10006");
        zipCodes.add("90011");

        //NAV TO ALLY
        driver.navigate().to("https://ally.com");
        sleep(3000);
        //HOVER MOUSE OVER CHECKING AND SAVINGS TAB AND CLICK IT
        ReusableActions.mouseHover(driver, "//*[contains(text(), 'Checking & Savings')]", "CHECKING AND SAVINGS TAB");
        sleep(3000);
        ReusableActions.clickAction(driver, "//*[contains(text(), 'Checking & Savings')]", "CHECKING AND SAVINGS TAB");
        sleep(3000);
        //CLICK ATM LOCATOR
        ReusableActions.clickAction(driver, "//*[text()= ' ATM Locator ']", "ATM LOCATOR BUTTON");
        sleep(3000);

        //LOG PASS
        logger.log(LogStatus.PASS, "SUCCESSFULLY CLICKED AND REDIRECTED TO ATM LOCATOR");

        for (int i = 0; i < zipCodes.size(); i++){
            WebElement zipCodeField = driver.findElement(By.xpath("//*[@id= 'address_desktop']"));

            ReusableActions.sendKeysAction(driver, "//*[@id= 'address_desktop']", zipCodes.get(i), "ZIP CODE FIELD");
            sleep(10000);
            //CLICK 1ST OPTION
            ReusableActions.clickAction(driver, "//*[@class= 'top active']", "FIRST OPTION");
            //SLEEP
            sleep(10000);
            //WHEN U GET HOME I WANT U TO CAPTURE AND PRINT ATM ADDRESS AND THEN DO WEBELEMENT CLEAR
            String addy = driver.findElement(By.xpath("//*[@class= 'info-window']/p")).getText();
            System.out.println("ADDRESS FOR ZIP CODE IS: " + addy);

            WebElement zipField = driver.findElement(By.xpath("//*[@id= 'address_desktop']"));
            zipField.clear();

            //LOG PASS
            logger.log(LogStatus.PASS, "SUCCESSFULLY CAPTURED ADDRESS FOR EACH ZIP CODE");
            //LOG INFO
            logger.log(LogStatus.INFO, "ADDRESS FOR ZIP CODE IS: " + addy);

        }//END OF FOR LOOP
        //END LOGGER FOR TEST 2
        reports.endTest(logger);
    }//END OF TEST 2
}//END OF SAVINGS CLASS
