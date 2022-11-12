package PRACTICE.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class PRACTICE_T2_WebDriverExample {
    public static void main(String[] args) throws InterruptedException {
        //declare webdrivermanager for chrome
        WebDriverManager.chromedriver().setup();

        //define an instance of chrome browser for testing
        WebDriver driver = new ChromeDriver();

        //navigate to google
        driver.navigate().to("https://google.com");

        //maximize screen
        driver.manage().window().maximize();

        //hold for three seconds
        sleep(3000);
        //then close session
        driver.close();
    }//end of main
}//end of class
