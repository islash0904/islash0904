package Day12_011622;

import Day9_010822.Reusable_Action;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class ListWebelement_USPS {

    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void setDriver(){driver = Reusable_Action.setDriver();
        reports= new ExtentReports("src/main/java/HTML_Report/Automation_Report.html",true);
    }

    @Test
    public void uspsTest(){
        //navigate to usps
        logger=reports.startTest("getting uspstabs");
        logger.log(LogStatus.INFO,"Navigate to USPS home page");
        driver.navigate().to("https://www.usps.com");

        //using explicit wait to get the count of elements within same class group
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            List<WebElement> uspsTabs = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
            System.out.println("My Nav list count is " + uspsTabs.size());
        } catch (Exception e) {
            System.out.println("unable to locate links " + e);
        }



    }//end of test



    @AfterSuite
    public void endOfSession() {driver.quit();}










}
