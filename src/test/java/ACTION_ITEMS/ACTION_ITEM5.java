package ACTION_ITEMS;

import REUSABLE_LIBRARY.ReusableActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class ACTION_ITEM5 {
    WebDriver driver;
    @BeforeSuite
    public void SetChromeDriver() {
        driver = ReusableActions.setUpChromeDriver();
    }//END OF SET DRIVER

    @AfterSuite
    public void quitTheSession() {
        driver.quit();
    }//END OF AFTER SUITE

    @Test(priority = 1)
    public void FindADoctor() throws InterruptedException {
        driver.navigate().to("https://UHC.com");
        sleep(3000);
        ReusableActions.clickAction(driver, "//*[text()= 'Find a doctor']", "FIND A DOC LINK");
        sleep(3000);
        ReusableActions.scrollByViewAction(driver, "//*[text()= 'Find a dentist')]",0, "FIND DENTIST LINK");


    }
}
