package ACTION_ITEMS;

import REUSABLE_LIBRARY.ReusableAction_Annotations;
import REUSABLE_LIBRARY.ReusableActions;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class ACTION_ITEM6_Checkings extends ReusableAction_Annotations {
    @Test
    public void hoverMouseOverCSTab() throws InterruptedException {
        //SET NAME OF TEST CASE TO REPORT
        logger = reports.startTest("hoverMouseOverCSTab");

        //NAV TO ALLY
        driver.navigate().to("https://ally.com");
        //SLEEP
        sleep(3000);
        //HOVER MOUSE OVER CHECKING AND SAVINGS TAB
        ReusableActions.mouseHover(driver, "//*[contains(text(), 'Checking & Savings')]", "CHECKING AND SAVINGS TAB");
        sleep(3000);
        logger.log(LogStatus.PASS, "Successfully hovered over C&S tab");
        //CLICK TAB
        ReusableActions.clickAction(driver, "//*[contains(text(), 'Checking & Savings')]", "CHECKING AND SAVINGS TAB");
        sleep(3000);
        logger.log(LogStatus.PASS, "SUCCESSFULLY CLICKED C&S TAB");
        //END LOGGER FOR TEST 1
        reports.endTest(logger);
    }//END OF TEST 1

    @Test(priority = 2)
    public void confirmPresenceOfAccountOptions() throws InterruptedException {
        //SET NAME OF TEST CASE TO REPORT
        logger = reports.startTest("confirmPresenceOfAccountOptions");

        //NAV TO ALLY
        driver.navigate().to("https://ally.com");
        sleep(3000);
        //HOVER MOUSE OVER CHECKING AND SAVINGS TAB AND CLICK IT
        ReusableActions.mouseHover(driver, "//*[contains(text(), 'Checking & Savings')]", "CHECKING AND SAVINGS TAB");
        sleep(3000);
        ReusableActions.clickAction(driver, "//*[contains(text(), 'Checking & Savings')]", "CHECKING AND SAVINGS TAB");
        sleep(3000);
        //CLICK "OPEN ACCOUNT"
        ReusableActions.clickAction(driver, "//*[text()= 'Open Account']", "OPEN ACCOUNT BUTTON");
        //SLEEP
        sleep(3000);
        //SCROLL TO THREE OPTIONS
        ReusableActions.scrollByViewAction(driver, "//*[@class= 'allysf-heading-v1-txt-20']", 0, "ACCOUNT OPTIONS");
        sleep(3000);
        //PASS LOG
        logger.log(LogStatus.PASS, "SUCCESSFULLY SCROLLED TO ACCOUNT OPTIONS");

        //VERIFY IF ACC OPTIONS ARE VISIBLE
        boolean areAccountOptionsVisible = driver.findElement(By.xpath("//*[text()= 'High Yield CD']")).isDisplayed();
        System.out.println("ELEMENT VISIBILITY STATUS IS: " + areAccountOptionsVisible);
        logger.log(LogStatus.INFO, "ELEMENT VISIBILITY STATUS IS: " + areAccountOptionsVisible);
        //END LOGGER FOR TEST 2
        reports.endTest(logger);
    }//END OF TEST 2

    @Test(priority = 3)
    public void isInfoNecessaryToApplyVisible() throws InterruptedException {
        //LOG NAME OF TEST
        reports.startTest("isInfoNecessaryToApplyVisible");
        //JAVA SCROLL INITIALIZE
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //NAV TO ALLY
        driver.navigate().to("https://ally.com");
        sleep(3000);
        //HOVER MOUSE OVER CHECKING AND SAVINGS TAB AND CLICK IT
        ReusableActions.mouseHover(driver, "//*[contains(text(), 'Checking & Savings')]", "CHECKING AND SAVINGS TAB");
        sleep(3000);
        ReusableActions.clickAction(driver, "//*[contains(text(), 'Checking & Savings')]", "CHECKING AND SAVINGS TAB");
        sleep(3000);
        //CLICK "OPEN ACCOUNT"
        ReusableActions.clickAction(driver, "//*[text()= 'Open Account']", "OPEN ACCOUNT BUTTON");
        //SLEEP
        sleep(3000);
        //SCROLL TO THREE OPTIONS
        ReusableActions.scrollByViewAction(driver, "//*[@class= 'allysf-heading-v1-txt-20']", 0, "ACCOUNT OPTIONS");
        sleep(3000);

        WebElement openAccount = driver.findElements(By.xpath("//*[text()='Open Account']")).get(0);
        ReusableActions.scrollByViewAction(driver, "//*[text()='Early withdrawal penalty will apply']", 0, "TEXT");
        //CLICK OPEN ACCOUNT
        ReusableActions.clickActionByIndex(driver, "//*[text()='Open Account']", 0, "OPEN ACC BUTTON");
        //SLEEP
        sleep(3000);
        //LOG PASS STAT
        logger.log(LogStatus.PASS, "SUCCESSFULLY CLICKED ON OPEN ACCOUNT");
        sleep(5000);

        //VERIFY THAT "WHAT YOU NEED" HEADING IS VISIBLE
        boolean isWhatYouNeedVisible = driver.findElement(By.xpath("//*[@class= 'is-medium-title']")).isDisplayed();
        System.out.println("WHAT YOU NEED VISIBILITY STATUS IS: " + isWhatYouNeedVisible);
        logger.log(LogStatus.INFO, "WHAT YOU NEED VISIBILITY STATUS IS: " + isWhatYouNeedVisible);
    }//END OF TEST 3
}//END OF CHECKINGS CLASS
