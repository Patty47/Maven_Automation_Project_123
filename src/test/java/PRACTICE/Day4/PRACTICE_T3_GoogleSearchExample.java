package PRACTICE.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class PRACTICE_T3_GoogleSearchExample {
    public static void main(String[] args) throws InterruptedException {
        //declare webrdivermanager for chrome
        WebDriverManager.chromedriver().setup();

        //define web browser for automation
        WebDriver driver = new ChromeDriver();

        //open google
        driver.navigate().to("https://google.com");
        //max screen
        driver.manage().window().maximize();
        //sleep statement
        sleep(3000);

        //find search bar input element
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Cars");
        //press submit by finding submit element
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //sleep statement
        sleep(3000);

        //get and extract results
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //split result to isolate amount of searches shown
        String[] splitResult = result.split(" ");
        System.out.println("result is " + splitResult[1]);

        //close
        driver.close();
    }
}
