package Day7_102122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.*;

public class T1_Select_Statement {
    public static void main(String[] args) throws InterruptedException {
        //define webdriver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver to use for your test
        //create an instance for a chrome driver(browser) for automation
        WebDriver driver = new ChromeDriver();

        //navigate to the google site
        driver.navigate().to("https://www.mlcalc.com");

        //maximize window
        driver.manage().window().maximize();

        //sleep statement
        sleep(3000);

        driver.findElement(By.xpath("//*[text()= 'Show advanced options']")).click();
        sleep(2000);

        //use select command
        WebElement strtMonth = driver.findElement(By.xpath("//*[@name= 'sm']"));
        Select startMonthDropDown = new Select(strtMonth);

        startMonthDropDown.selectByVisibleText("Nov");

        //use select for year
        /*WebElement startYear = driver.findElement(By.xpath("//*[@name= 'sy']"));
        Select startYearDropDown = new Select(startYear);
        //select by visible text
        startYearDropDown.selectByVisibleText("2023");*/

        //OR
        WebElement startYear = driver.findElement(By.xpath("//*[@name= 'sy']"));
        Select startYearDropDown = new Select(startYear);
        //SELECT BY VISIBLE TEXT
        driver.findElement(By.xpath("//*[@name='sy']")).click();
        driver.findElement(By.xpath("//*[text()='2023']")).click();
        //YOU CAN MIX @name, and find by text,etc


    }//end of maim
}//end of class
