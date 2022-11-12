package ACTION_ITEMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class ACTION_ITEM2 {
    public static void main(String[] args) throws InterruptedException {
        //CREATE AN ARRAY LIST FOR SPORTS
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Basketball");
        sports.add("Extreme Frisbee");
        sports.add("Hockey");
        sports.add("Football");

        //DECLARE WEBDRIVER MANAGER FOR CHROME
        WebDriverManager.chromedriver().setup();
        //DEFINE INSTANCE OF BROWSER FOR AUTOMATION
        WebDriver driver = new ChromeDriver();

        /*//NAVIGATE TO BING.COM
        driver.navigate().to("https://bing.com");
        //MAX SCREEN
        driver.manage().window().maximize();
        //SLEEP STATEMENT
        Thread.sleep(3000);

        //FIND SEARCH INPUT ELEMENT AND TYPE "FOOTBALL"
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Football");
        //FIND SUBMIT BUTTON ELEMENT AND SUBMIT SEARCH
        driver.findElement(By.xpath("//*[@id='sb_hidden']")).submit();
        //SLEEP STATEMENT
        Thread.sleep(3000);

        //CAPTURE SEARCH RESULT
        String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
        //EXTRACT AND ISOLATE JUST SEARCH RESULT NUMBER
        String[] splitResult = result.split(" ");
        System.out.println("The amount of search results for " + " Football is " + splitResult[0]);

        *///DECLARE DEFINE FOR LOOP
        for(int i=0; i<sports.size();i++) {

            //NAVIGATE TO BING
            driver.navigate().to("https://bing.com");
            //MAXIMIZE SCREEN
            driver.manage().window().fullscreen();

            //SLEEP STATEMENT
            Thread.sleep(3000);

            //FIND SEARCH INPUT ELEMENT AND TYPE SPORTS
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports.get(i));
            //HIT SUBMIT
            driver.findElement(By.xpath("//*[@id='sb_hidden']")).submit();
            //SLEEP STATEMENT
            Thread.sleep(3000);

            //CAPTURE SEARCH RESULT
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //SPLIT RESULT TO EXTRACT ONLY NUMBER
            String[] splitResult = result.split(" ");
            System.out.println("The amount of search results for " + sports.get(i) + " is " + splitResult[0]);

            //SLEEP STATEMENT
            Thread.sleep(3000);

        }//end of for loop

        //CLOSE SESSION
        driver.close();
    }//end of main
}//end of class
