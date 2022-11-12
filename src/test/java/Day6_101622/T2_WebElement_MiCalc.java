package Day6_101622;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class T2_WebElement_MiCalc {
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

        //clear and enter a new value in purchase price field
        WebElement pPrice = driver.findElement(By.xpath("//*[@name='ma']"));
        //clear field
        pPrice.clear();
        //type new value in purchase price field
        pPrice.sendKeys("450000");

        //sleep statement
        sleep(3000);

        //clear and enter value in down payment field
        WebElement dPayment = driver.findElement(By.xpath("//*[@name='dp']"));
        //clear field
        dPayment.clear();
        //type new value in down payment field
        dPayment.sendKeys("25");
    }//end of main
}//end of class
