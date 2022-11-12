package Day5_101522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class T1_Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        //define the chrome driver to use for your test
        //create an instance for a chrome driver(browser) for automation
        WebDriver driver = new ChromeDriver();

        //navigate to the google site
        driver.navigate().to("https://www.yahoo.com");

        //maximize window
        driver.manage().window().maximize();

        //sleep statement
        sleep(3000);

        driver.findElement(By.xpath("//*[text() = 'Sign in' ]")).click();

        driver.navigate().to("https://www.yahoo.com");

        driver.findElement(By.xpath("//*[contains(@class, 'rapid-nonanchor')]")).click();

        sleep(2000);

        driver.quit();
    }
}
