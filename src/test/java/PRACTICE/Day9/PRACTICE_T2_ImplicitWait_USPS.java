package PRACTICE.Day9;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class PRACTICE_T2_ImplicitWait_USPS {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        ChromeDriver driver = new ChromeDriver(options);

        //INITIALIZE IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //NAV TO USPS

    }
}
