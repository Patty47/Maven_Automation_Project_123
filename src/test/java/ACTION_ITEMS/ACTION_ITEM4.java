package ACTION_ITEMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class ACTION_ITEM4 {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();

        //initialize chrome options
        ChromeOptions options = new ChromeOptions();

        // add the options for maximizing the chrome meeting
        // options.addArguments("start-fullscreen") for mac
        options.addArguments("start-maximized");

        //define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation
        WebDriver driver = new ChromeDriver(options);

        ArrayList<String> destinations;
        destinations = new ArrayList<>();
        destinations.add("Los Angeles");
        destinations.add("Miami");
        destinations.add("Key West");



        //BEGIN FOR LOOP
        for (int i=0; i < destinations.size(); i++) {


            //navigate to hotels.com
            driver.navigate().to("https://www.hotels.com");
            sleep(2000);

            //click "GOING TO" field
            WebElement goingTo = driver.findElement(By.xpath("//*[@class= 'uitk-fake-input uitk-form-field-trigger']"));
            goingTo.submit();
            goingTo.sendKeys(destinations.get(i));
            //SLEEP
            sleep(3000);
            driver.findElements(By.xpath("//*[contains(@class,'truncate')]")).get(1).click();
            //SLEEP
            sleep(3000);

            //click TRAVELERS, then ADULT LIST TO SET BACK TO ONE
            driver.findElement(By.xpath("//*[contains(@class, 'uitk-menu-trigger uitk')]")).click();
            //SLEEP
            sleep(3000);
            //CLICK MINUS BUTTON FOR ADULTS
            driver.findElements(By.xpath("//*[contains(@class, 'uitk-icon uitk-step-input-icon uitk-icon-medium')]")).get(0).click();
            //SET WEBELEMENT FOR PLUS BUTTON
            WebElement adultPlus = driver.findElements(By.xpath("//*[contains(@class,'uitk-step-input-button')]")).get(1);
            //CLICK PLUS BUTTON FOR ADULTS
            adultPlus.click();
            adultPlus.click();
            //CLICK KIDS PLUS BUTTOM
            WebElement kidsPlus = driver.findElements(By.xpath("//*[contains(@class,'uitk-icon uitk-step-input-icon uitk-icon-medium')]")).get(3);
            kidsPlus.click();
            //USE SELECT FOR KIDS AGE DROPDOWN
            WebElement kidsAge = driver.findElement(By.xpath("//*[contains(@id,'age-traveler_selector_children_age_selector-0-0')]"));
            Select kidsAgeDropDown = new Select(kidsAge);
            kidsAgeDropDown.selectByVisibleText("2");
            //CLICK DONE
            driver.findElement(By.xpath("//*[@id= 'traveler_selector_done_button']")).click();

            //CLICK SEARCH
            driver.findElement(By.xpath("//*[@class= 'uitk-icon uitk-icon-leading uitk-icon-medium']")).click();

            //DESCRIBE ARRAYLIST
            ArrayList<WebElement> Links = new ArrayList<>(driver.findElements(By.xpath("//*[@class= 'uitk-spacing uitk-spacing-margin-blockstart-three')]")));
            //CLICK HOTEL LINK USING IF ELSE CONDITION
            if (i==0){
                Links.get(1).click();
            } else if (i==1){
                Links.get(2).click();
            } else if (i==2){
                Links.get(0).click();
            }//END OF IF ELSE CONDITION
        }//END OF FOR LOOP
    }//END OF MAIN
}//END OF CLASS
