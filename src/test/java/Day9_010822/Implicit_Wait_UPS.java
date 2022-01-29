package Day9_010822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Implicit_Wait_UPS {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //declare all
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set my driver
        WebDriver driver = new ChromeDriver(options);
        //declare and define your global implicit wait for all web elements
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.navigate().to("https://www.ups.com/us/en/Home.page");
       // Thread.sleep(1500);
        //click on Track
        driver.findElement(By.xpath("//*[text()= 'Tracking']"));
        //click on track a package
        driver.findElement(By.xpath("//*[text()='Track a Package']")).click();












    }//end of main











}//end of java test
