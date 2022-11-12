package PRACTICE.Day8;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.*;

public class PRACTICE_T1_TryCatch_MortgageCalculator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();

        //CHROME OPTIONS
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        ChromeDriver driver = new ChromeDriver(options);

        //NAVIGATE TO MORTGAGE CALCULATOR
        driver.navigate().to("https://www.mortgagecalculator.org");
        //SLEEP
        sleep(2000);

        //CLEAR AND ENTER NEW HOME VALUE
        try {
            WebElement homeValue = driver.findElement(By.xpath("//*[@id= 'homeval']"));
            homeValue.clear();
            homeValue.sendKeys("350000");
        } catch (Exception e) {
            System.out.println("Unable to enter new home value... " + e);
        }//END OF TRY CATCH EXCEPTION

        try {
            WebElement downPayment = driver.findElement(By.xpath("//*[@id= 'downpayment']"));
            downPayment.clear();
            downPayment.sendKeys("12000");
        } catch (Exception e) {
            System.out.println("Unable to clear and enter down payment value... " + e);
        }//END OF TRY CATCH EXCEPTION

        //SELECT NEW VALUE FOR START MONTH
        try {
            WebElement strtMonth = driver.findElement(By.xpath("//*[@name= 'param[start_month]']"));
            Select dropDown = new Select(strtMonth);
            dropDown.selectByVisibleText("Nov");
        } catch (Exception e) {
            System.out.println("Unable to select new value for start month... " + e);
        }//END OF TRY CATCH

        //CLEAR AND ENTER NEW START YEAR VALUE
        try {
            WebElement strtYear = driver.findElement(By.xpath("//*[@id= 'start_year']"));
            strtYear.clear();
            strtYear.sendKeys("2026");
        } catch (Exception e) {
            System.out.println("Unable to clear and enter new start year value... " + e);
        }//END OF TRY CATCH

        //SLEEP
        sleep(3000);

        //CLICK ON CALCULATE
        try {
            driver.findElement(By.xpath("//*[@value= 'Calculate']")).click();
        } catch (Exception e) {
            System.out.println("Unable to click calculate... " + e);
        }//END OF TRY CATCH

        //CAPTURE AND PRINT MONTHLY PAYMENT
        try {
            String result = driver.findElements(By.xpath("//*[@class= 'left-cell']")).get(12).getText();
            System.out.println("Monthly payment is: " + result);
        } catch (Exception e) {
            System.out.println("Unable to capture monthly payment " + e);
        }//END OF TRY CATCH



    }//END OF MAIN
}//END OF CLASS