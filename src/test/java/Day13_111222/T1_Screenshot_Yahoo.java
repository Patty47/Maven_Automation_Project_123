package Day13_111222;

import REUSABLE_LIBRARY.ReusableAction_Annotations;
import REUSABLE_LIBRARY.ReusableAction_Loggers;
import REUSABLE_LIBRARY.ReusableActions;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T1_Screenshot_Yahoo extends ReusableAction_Annotations {
    @Test (priority = 1)
    public void TC001_verifySignedInOptionIsChecked() {
        driver.navigate().to("https://yahoo.com");


        ReusableAction_Loggers.clickAction(driver, "//*[@class= '_yb_1933eyyy:p]", logger, "Sign In");
        //VERIFY
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        System.out.println("The Checkbox check condition is: " + isSignInChecked);
        logger.log(LogStatus.INFO, "The checkbox check status is: " +isSignInChecked);
    }
}
