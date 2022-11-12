package PRACTICE.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static java.lang.Thread.*;

public class PRACTICE_T4_DataDrivenTesting {
    public static void main(String[] args) throws InterruptedException {
        //CREATE AN ARRAY LIST FOR CARS
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Jeep");
        cars.add("Ford");

        //DECLARE WEBDRIVER MANAGER FOR CHROME
        WebDriverManager.chromedriver().setup();
        //DEFINE INSTANCE OF BROWSER FOR AUTOMATION
        WebDriver driver = new ChromeDriver();

        //DECLARE DEFINE FOR LOOP
        for (int i = 0; i < cars.size(); i++) {

            //NAVIGATE TO GOOGLE
            driver.navigate().to("https://google.com");
            //MAXIMIZE SCREEN
            driver.manage().window().maximize();

            //SLEEP STATEMENT
            Thread.sleep(3000);

            //FIND SEARCH INPUT ELEMENT AND TYPE CARS
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cars.get(i));
            //HIT SUBMIT
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();

            //SLEEP STATEMENT
            Thread.sleep(3000);

            //CAPTURE SEARCH RESULT
            String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //SPLIT RESULT TO EXTRACT ONLY NUMBER
            String[] splitResult = result.split(" ");
            System.out.println("The amount of search results for " + cars.get(i) + " is " + splitResult[1]);

        }//end of for loop

        //CLOSE SESSION
        driver.close();
    }
}