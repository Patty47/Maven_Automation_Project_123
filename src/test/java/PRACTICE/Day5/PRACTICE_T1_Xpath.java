package PRACTICE.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import static java.lang.Thread.*;

public class PRACTICE_T1_Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://yahoo.com");

        //MAX SCREEN
        driver.manage().window().maximize();

        //SLEEP STATEMENT
        sleep(3000);

        //CLICK SIGN IN
        driver.findElement(By.xpath("//*[text()= 'Sign in']")).click();

        //GO BACK TO HOMEPAGE
        driver.navigate().to("https://yahoo.com");

        //CLICK NOTI BELL
        driver.findElement(By.xpath("//*[contains(@class, 'rapid-nonanchor')]")).click();

        //SLEEP STATEMENT
        sleep(2000);

        driver.quit();
    }
}
