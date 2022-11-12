package PRACTICE.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.plaf.TableHeaderUI;

import static java.lang.Thread.*;

public class PRACTICE_T2_ChromeOptions {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        options.addArguments("headless");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://google.com");

        //SLEEP
        sleep(3000);

        //TYPE CARS INTO SEARCH FIELD
        driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys("CARS");
        //PRESS SUBMIT
        driver.findElement(By.xpath("//*[@name= 'btnK']")).submit();

        //CAPTURE RESULTS
        String results = driver.findElement(By.xpath("//*[@id= 'result-stats']")).getText();
        //SPLIT AND ISOLATE RESULT #
        String[] splitResults = results.split(" ");
        System.out.println("Amount of results showing is " + splitResults[1]);

        driver.quit();
    }//end of main
}//end of class
