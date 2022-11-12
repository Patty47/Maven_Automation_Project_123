package PRACTICE.Day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class PRACTICE_T2_WebElement_MLCalc {
    public static void main(String[] args) throws InterruptedException {
        //define webdriver manager for chromedriver
        WebDriverManager.chromedriver().setup();

        //define the chrome driver to use for your test
        //create an instance for a chrome driver (browser) to use for automation
        WebDriver driver = new ChromeDriver();

        //navigate to the google site
        driver.navigate().to("https://www.mlcalc.com");

        driver.manage().window().maximize();

        //wait a few seconds
        sleep(3000);

        //FIND PURCHASE PRICE ELEMENT AND LINK TO WEBELEMENT
        WebElement pPrice = driver.findElement(By.xpath("//*[@name= 'ma']"));
        //CLEAR FIELD
        pPrice.clear();
        //TYPE NEW VALUE
        pPrice.sendKeys("450000");

        //SLEEP STATEMENT
        sleep(3000);

        //FIND DOWNPAYMENT ELEMENT, CLEAR AND ENTER NEW VALUE INTO FIELD
        WebElement dPayment = driver.findElement(By.xpath("//*[@name= 'dp']"));
        //CLEAR
        dPayment.clear();
        //TYPE NEW VALUE
        dPayment.sendKeys("25");



    }
}
