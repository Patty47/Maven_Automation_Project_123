package ACTION_ITEMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

import static java.lang.Thread.*;

public class ACTION_ITEM3 {
    public static void main(String[] args) throws InterruptedException {
        //DECLARE AND DEFINE CHROME OPTIONS
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        options.addArguments("incognito");

        //CREATE AN INSTANCE OF CHROMEDRIVER FOR AUTOMATION
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        //CREATE AN ARRAY LIST OF REAL ZIP CODES
        ArrayList<String> zipCodes;
        zipCodes = new ArrayList<>();
        zipCodes.add("33065");
        zipCodes.add("33067");
        zipCodes.add("33068");

        //BEGIN FOR LOOP
        for (int i=0; i < zipCodes.size(); i++) {

            driver.navigate().to("https://weightwatchers.com/us/find-a-workshop/");

            //SLEEP
            sleep(3000);
            driver.findElements(By.xpath("//*[text()= 'Find a Workshop']")).get(0).click();
            driver.findElement(By.xpath("//*[text()= 'In-Person']")).click();

            //SLEEP
            sleep(2000);

            //FIND ZIPCODE INPUT FIELD, CLEAR IT, AND ENTER ARRAY VALUES
            WebElement zipField = driver.findElement(By.xpath("//*[@title= 'location-search']"));
            zipField.clear();
            zipField.sendKeys(zipCodes.get(i));
            //CLICK SEARCH ARROW
            driver.findElement(By.xpath("//*[@class= 'rightArrow-daPRP']")).click();
            //SLEEP
            sleep(2000);

            //CLICK ON A SPECIFIC STUDIO LINK
            driver.findElements(By.xpath("//*[@class= 'linkUnderline-1_h4g']")).get(0).click();
            //SLEEP
            sleep(3000);
            //EXTRACT AND PRINT OUT ADDRESSES FROM FIRST STU LINKS
            String address = driver.findElements(By.xpath("//*[@class= 'address-2PZwW']")).get(0).getText();
            System.out.println("ADDRESS:  " + address);

            //QUIT
            driver.quit();


        }//end loop


    }//END OF MAIN
}//END OF CLASS
