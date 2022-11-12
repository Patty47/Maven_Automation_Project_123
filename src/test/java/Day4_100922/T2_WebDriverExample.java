package Day4_100922;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_WebDriverExample {
    public static void main(String[] args) throws InterruptedException {
        //define webdriver manager for chromedriver
        WebDriverManager.chromedriver().setup();

        //define the chrome driver to use for your test
        //create an instance for a chrome driver (browser) to use for automation
        WebDriver driver = new ChromeDriver();

        //navigate to the google site
        driver.navigate().to("https://www.google.com");

        driver.manage().window().maximize();

        //wait a few seconds
        Thread.sleep(3000);

        //quit the chrome session
        driver.close();
    }//end of main
}//end of class
