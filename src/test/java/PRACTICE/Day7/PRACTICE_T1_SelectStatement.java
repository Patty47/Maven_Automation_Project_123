package PRACTICE.Day7;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.*;

public class PRACTICE_T1_SelectStatement {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();

        //CHROME OPTIONS
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        ChromeDriver driver = new ChromeDriver(options);

        //NAVIGATE TO MLCALC.COM
        driver.navigate().to("https://mlcalc.com");

        //SLEEP
        sleep(3000);

        //CLICK ON SHOW ADVANCED OPTIONS
        driver.findElement(By.xpath("//*[text()= 'Show advanced options']")).click();

        //USE SELECT ON START MONTH
        WebElement strtMonth = driver.findElement(By.xpath("//*[@name= 'sm']"));
        Select strtMonthDropDown = new Select(strtMonth);
        strtMonthDropDown.selectByVisibleText("Aug");

        //USE SELECT ON START YEAR
        WebElement strtYear = driver.findElement(By.xpath("//*[@name= 'sy']"));
        Select strtYearDropDown = new Select(strtYear);
        strtYearDropDown.selectByVisibleText("2027");



    }//end of main
}//end of class
