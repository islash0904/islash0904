package Day9_010822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_USPS {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        //declare all
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        //set my driver
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.USPS.com");

        Thread.sleep(1500);

        //verify the welcome page title appears as expected
        String actualTitle = driver.getTitle();
        //by using if else to compare expected with actual title
        if(actualTitle.equals("Welcome | USPS")){
            System.out.println("Title matches " + actualTitle);
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }


        //declare mouse actions
        Actions mouseAction = new Actions(driver);
 //click on look up a Zip code from the drop down
        try {
            WebElement sendTab = driver.findElement(By.xpath("//*[text()='Send']"));
            mouseAction.moveToElement(sendTab).perform();
        }catch (Exception e){
            System.out.println("unable to hover to send tab" + e);
        }

        try {
            WebElement zipCodeLookup = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookup).click().perform();
        }catch (Exception e){
            System.out.println("unable to hover to zipCode" + e);
        }


















    }







}
