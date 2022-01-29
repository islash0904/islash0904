package Day9_010822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Explicit_Wait_UPS {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        //declare all
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set my driver
        WebDriver driver = new ChromeDriver(options);
        //declare and define your global implicit wait for all web elements

        driver.navigate().to("https://www.ups.com/us/en/Home.page");
        //declaring explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);

//click on Track
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Tracking']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Track " + e);
        }

        //click on track a package
        try {
            //click on Track
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
        } catch (Exception e) {
            System.out.println("unable to click on track a package" +e);
        }

















    }




}
