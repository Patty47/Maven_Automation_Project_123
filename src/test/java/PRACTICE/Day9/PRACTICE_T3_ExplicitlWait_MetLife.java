package PRACTICE.Day9;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static java.lang.Thread.*;

public class PRACTICE_T3_ExplicitlWait_MetLife {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        ChromeDriver driver = new ChromeDriver(options);

        //NAV TO METLIFE
        driver.navigate().to("https://metlife.com");
        //SLEEP
        sleep(3000);

        //INITIALIZE EXPLICIT WAIT
        WebDriverWait wait = new WebDriverWait(driver, 20);

        //CLICK ON SOLUTIONS TAB USING EXPLICIT CONDITIONS
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'SOLUTIONS')]"))).click();

        //CLICK ON FIRST DENTAL LINK
        ArrayList<WebElement> dentalLink = new ArrayList<>(wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[text()= 'Dental']"))));
        dentalLink.get(0).click();

    }
}
