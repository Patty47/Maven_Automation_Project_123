package PRACTICE.Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.*;

public class PRACTICE_T1_MouseActions_USPS {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);

        //NAV TO USPS.COM
        driver.navigate().to("https://usps.com");
        //DEFINE SEND TAB AND HOVER MOUSE OVER IT
        WebElement sendTab = driver.findElement(By.xpath("//*[@id= 'mail-ship-width']"));
        Actions mouseActions = new Actions(driver);
        mouseActions.moveToElement(sendTab).perform();

        //CLICK ON CALCULATE A PRICE USING MOUSE CLICK
        WebElement calculatePrice = driver.findElements(By.xpath("//*[text()= 'Calculate a Price']")).get(1);
        mouseActions.click(calculatePrice).perform();

        //SLEEP
        sleep(3000);

        //DOUBLE CLICK ON USPS HOME LOGO
        WebElement logo = driver.findElement(By.xpath("//*[@alt= 'USPS.com home']"));
        mouseActions.doubleClick(logo).perform();
        //SLEEP
        sleep(3000);

        //RIGHT CLICK ON USPS HOME LOGO
        WebElement logoHomePage = driver.findElement(By.xpath("//*[@alt= 'Image of USPS.com logo.']"));
        mouseActions.contextClick(logoHomePage).perform();
        //SLEEP
        sleep(3000);
        //QUIT
        driver.quit();

    }//end of main
}//end of class
