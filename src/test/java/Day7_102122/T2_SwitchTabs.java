package Day7_102122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static java.lang.Thread.*;

public class T2_SwitchTabs {
    public static void main(String[] args) throws InterruptedException {
        //define webdriver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver to use for your test
        //create an instance for a chrome driver(browser) for automation
        WebDriver driver = new ChromeDriver();

        //navigate to the google site
        driver.navigate().to("https://www.fideliscare.org");

        //maximize window
        driver.manage().window().maximize();

        //sleep statement
        sleep(3000);

        //click on shop for a plan
        driver.findElement(By.xpath("//*[text() = 'Shop For a Plan']")).click();

        //SLEEP
        sleep(2000);

        driver.findElement(By.xpath("//*[text() = 'Medicaid Managed Care']")).click();

        //SLEEP
        sleep(2000);

        //CLICK ON FIND A DOCTOR SEARCH ICON
        driver.findElement(By.xpath("//*[@class= 'btn btn-outline-primary btn-external btn-show link-external']")).click();

        //SLEEP
        sleep(2000);

        //STORE TABS IN ARRAYLIST
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        //SWITCH TO NEW TAB
        driver.switchTo().window(tabs.get(1));

        //ENTER A ZIP CODE IN SEARCH FIELD
        driver.findElement(By.xpath("//*[@id= 'searchLocation']")).sendKeys("11230");

        //SLEEP
        sleep(2000);

        //CLOSE
        driver.close();

        //GO BACK TO INITIAL TAB
        driver.switchTo().window(tabs.get(0));

        //NAVIGATE BACK TO HOME PAGE
        driver.navigate().to("https://www.fideliscare.org");

        //SLEEP
        sleep(2000);

        //CLICK ON GET COVERAGE, FIRST MATCH IS INDEX 0
        driver.findElements(By.xpath("//*[@class= 'btn ng-binding btn-primary']")).get(0).click();
        //SLEEP
        sleep(3000);

        driver.close();
    }
}
