package PRACTICE.RANDOM;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static java.lang.Thread.*;

public class FAUSSE_SHIRT_CHECKOUT {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        ChromeDriver driver = new ChromeDriver(options);

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        //NAV TO FAUSSE.CO
        driver.navigate().to("https://fausse.co");
        //SLEEP
        sleep(3000);

        //INITIALIZE EXPLICIT WAIT
        WebDriverWait wait = new WebDriverWait(driver, 20);

        //CLICK ON SHOP USING EXPLICIT WAIT
        ArrayList<WebElement> shopLink = new ArrayList<>(wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[text()= 'SHOP']"))));
        shopLink.get(0).click();

        //SLEEP
        sleep(3000);

        //SCROLL TO BOTTOM SHIRT LINK BUTTON
        WebElement bottomShirtLink = driver.findElement(By.xpath("//*[@class='full-unstyled-link']"));
        jse.executeScript("arguments[0].scrollIntoView(true);", bottomShirtLink);
        //CLICK LINK
        bottomShirtLink.click();

        //CLICK MEDIUM SIZE USING EXPLICIT WAIT
        ArrayList<WebElement> mediumLinks = new ArrayList<>(wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'Medium')]"))));
        mediumLinks.get(2).click();
        //SLEEP
        sleep(2000);

        //CLICK ADD TO CART USING EXPLICIT WAIT
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@type= 'submit']"))).click();
        //SLEEP
        sleep(2000);

        //CLICK CHECKOUT USING EXPLICIT WAIT
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()= 'Check out']"))).click();

    }//END OF MAIN
}//END OF CLASS
