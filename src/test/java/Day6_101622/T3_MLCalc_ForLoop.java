package Day6_101622;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class T3_MLCalc_ForLoop {
    public static void main(String[] args) throws InterruptedException {
        //define webdriver manager for chromedriver
        WebDriverManager.chromedriver().setup();

        //define the chrome driver to use for your test
        //create an instance for a chrome driver (browser) to use for automation
        WebDriver driver = new ChromeDriver();

        //create an array list for purchase price, down payment, and interest rate
        ArrayList<String> purchasePrice, downPayment, interestRate;
        purchasePrice = new ArrayList<>();
        purchasePrice.add("300000");
        purchasePrice.add("350000");
        purchasePrice.add("400000");

        downPayment = new ArrayList<>();
        downPayment.add("25");
        downPayment.add("30");
        downPayment.add("35");

        interestRate = new ArrayList<>();
        interestRate.add("3.5");
        interestRate.add("4.1");
        interestRate.add("4.5");

        //begin for loop
        for (int i=0; i < interestRate.size(); i++) {

            //navigate to the mlcalc site
            driver.navigate().to("https://www.mlcalc.com");

            driver.manage().window().maximize();

            //wait a few seconds
            sleep(3000);

            //clear and enter a new value in purchase price field
            WebElement pPrice = driver.findElement(By.xpath("//*[@name='ma']"));
            //clear field
            pPrice.clear();
            //type new value in purchase price field
            pPrice.sendKeys(purchasePrice.get(i));

            //sleep statement
            sleep(3000);

            //clear and enter value in down payment field
            WebElement dPayment = driver.findElement(By.xpath("//*[@name='dp']"));
            //clear field
            dPayment.clear();
            //type new value in down payment field
            dPayment.sendKeys(downPayment.get(i));

            //sleep statement
            sleep(3000);

            //clear and enter value in interest rate field
            WebElement intRate = driver.findElement(By.xpath("//*[@id= 'ir']"));
            //clear interest rate field
            intRate.clear();
            //type new value in interest rate field
            intRate.sendKeys(interestRate.get(i));

            //SLEEP STATEMENT
            sleep(3000);

            //click on calculate button
            driver.findElement(By.xpath("//*[@value= 'Calculate']")).click();

            //SLEEP STATEMENT
            sleep(3000);

            //capture and print monthly payment value
            String mntPayment = driver.findElements(By.xpath("//*[@style= 'font-size: 32px']")).get(0).getText();
            System.out.println("Monthly Payment is: " + mntPayment);

            driver.quit();

            }//end of loop
        }
    }
