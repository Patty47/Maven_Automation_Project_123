package PRACTICE.Day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class PRACTICE_T1_FindElements {
    public static void main(String[] args) throws InterruptedException {
        //define webdriver manager for chromedriver
        WebDriverManager.chromedriver().setup();

        //define the chrome driver to use for your test
        //create an instance for a chrome driver (browser) to use for automation
        WebDriver driver = new ChromeDriver();

        //navigate to the google site
        driver.navigate().to("https://www.yahoo.com");

        driver.manage().window().maximize();

        //wait a few seconds
        sleep(3000);

        driver.findElements(By.xpath("//*[contains(@class,'_yb_sc88r')]")).get(3).click();
    }
}
