package PRACTICE.Day7;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

import static java.lang.Thread.*;

public class PRACTICE_T2_SwitchTabs {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();

        //CHROME OPTIONS
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        ChromeDriver driver = new ChromeDriver(options);

        //NAVIGATE TO FIDELISCARE.ORG
        driver.navigate().to("https://fideliscare.org");
        //SLEEP
        sleep(3000);

        //CLICK SHOP FOR A PLAN
        driver.findElement(By.xpath("//*[text()= 'Shop For a Plan']")).click();
        //SLEEP
        sleep(3000);
        //CLICK MEDICAID MANAGED CARE
        driver.findElement(By.xpath("//*[text()= 'Medicaid Managed Care']")).click();

        //CLICK FIND A DOCTOR LINK
        driver.findElement(By.xpath("//*[@class= 'btn btn-outline-primary btn-external btn-show link-external']")).click();

        //SLEEP
        sleep(3000);

        //ADD TABS INTO ARRAY
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        //GO TO NEW TAB
        driver.switchTo().window(tabs.get(1));

        //ENTER ZIP CODE INTO LOCATION FIELD
        driver.findElement(By.xpath("//*[@id= 'searchLocation']")).sendKeys("33065");

        //SLEEP
        sleep(3000);
        //CLOSE TAB
        driver.close();

        //GO TO INITIAL TAB
        driver.switchTo().window(tabs.get(0));

        //NAVIGATE HOME PAGE
        driver.navigate().to("https://fideliscare.org");

        //SLEEP
        sleep(3000);

        //CLICK GET COVERAGE
        driver.findElement(By.xpath("//*[@class= 'btn ng-binding btn-primary']")).click();

        //SLEEP
        sleep(3000);

        //quit
        driver.quit();
    }//end main
}//end class
