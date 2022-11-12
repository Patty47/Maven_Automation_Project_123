package PRACTICE.Day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static java.lang.Thread.*;
import static java.lang.Thread.sleep;

public class PRACTICE_T3_MLCalc_ForLoop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        ArrayList<String> purchasePrice, downPayment, interestRate;
        purchasePrice = new ArrayList<>();
        purchasePrice.add("300000");
        purchasePrice.add("350000");
        purchasePrice.add("400000");

        downPayment = new ArrayList<>();
        downPayment.add("20");
        downPayment.add("25");
        downPayment.add("30");

        interestRate = new ArrayList<>();
        interestRate.add("3.1");
        interestRate.add("3.4");
        interestRate.add("4.1");

        //BEGIN FOR LOOP
        for (int i=0; i < interestRate.size(); i++) {

            driver.navigate().to("https://mlcalc.com");
            driver.manage().window().maximize();

            //SLEEP
            sleep(3000);

            //FIND PURCHASE PRICE ELEMENT, CLEAR , AND ENTER NEW VALUE
            WebElement pPrice = driver.findElement(By.xpath("//*[@name= 'ma']"));
            pPrice.clear();
            pPrice.sendKeys(purchasePrice.get(i));

            //FIND DOWN PAYMENT ELEMENT, CLEAR , AND ENTER NEW VALUE
            WebElement dPayment = driver.findElement(By.xpath("//*[@name= 'dp']"));
            dPayment.clear();
            dPayment.sendKeys(downPayment.get(i));

            //FIND INTEREST RATE ELEMENT, CLEAR, AND ENTER NEW VALUE
            WebElement intRate = driver.findElement(By.xpath("//*[@name= 'ir']"));
            intRate.clear();
            intRate.sendKeys(interestRate.get(i));

            //CLICK CALCULATE
            driver.findElement(By.xpath("//*[@value= 'Calculate']")).click();

            //CAPTURE AND ISOLATE RESULTS
            String mntPayment = driver.findElements(By.xpath("//*[@style= 'font-size: 32px']")).get(0).getText();
            System.out.println("MY MONTHLY PAYMENT IS " + mntPayment);

            driver.quit();
        }//end of loop
    }//end of main
}//end of class