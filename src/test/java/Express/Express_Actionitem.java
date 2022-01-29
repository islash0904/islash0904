package Express;

import Day9_010822.Reusable_Action;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotation;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express_Actionitem  {

    WebDriver driver;
     ExtentReports reports;
     ExtentTest logger;

    @BeforeSuite
    public void setTheDriver(){
        driver = Reusable_Actions_Loggers.setDriver();
        //set the path of the report once
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html",true);
    }//end of precondition







    @Test()
    public void ExpressTest() throws InterruptedException, BiffException, IOException, WriteException {

        //Step 1: read the data from the excel sheet you created
        Workbook readableFile = Workbook.getWorkbook(new java.io.File("src/main/resources/Express_2022_$$$.xls"));
        //Step 2: locating the worksheet that you created for the workbook
        Sheet readableSheet = readableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);

        //Step 3: create a writable file to mimic readable but you can also write back the results to this file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/Results_Express.xls"),readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);

        //generate the for/while loop
        int i = 1;
        while( i < rowCount2){

            String size = writableSheet.getCell(0, i).getContents();
            System.out.println("My size is " + size);
            String quantity = writableSheet.getCell(1, i).getContents();
            System.out.println("My quantity is " + quantity);
            String firstName = writableSheet.getCell(2, i).getContents();
            System.out.println("My firstname is " + firstName);
            String lastName = writableSheet.getCell(3, i).getContents();
            System.out.println("My lastName is " + lastName);
            String email = writableSheet.getCell(4, i).getContents();
            System.out.println("My email is " + email);
            String phoneNumber = writableSheet.getCell(5, i).getContents();
            System.out.println("My phoneNumber is " + phoneNumber);
            String address = writableSheet.getCell(6, i).getContents();
            System.out.println("My address are " + address);
            String zipcode = writableSheet.getCell(7, i).getContents();
            System.out.println("My zipcode are " + zipcode);
            String city = writableSheet.getCell(8, i).getContents();
            System.out.println("My city are " + city);
            String state = writableSheet.getCell(9, i).getContents();
            System.out.println("My state are " + state);
            String cardNumber = writableSheet.getCell(10, i).getContents();
            System.out.println("My cardNumber are " + cardNumber);
            String ExpMo=writableSheet.getCell(11, i).getContents();
            System.out.println("My ExpirationMonths are " + ExpMo);
            String ExpYear = writableSheet.getCell(12, i).getContents();
            System.out.println("My ExpirationYears are " + ExpYear);
            String SecCode = writableSheet.getCell(13, i).getContents();
            System.out.println("My SecurityCodes are " + SecCode);
            String ErrorCode = writableSheet.getCell(14, i).getContents();
            System.out.println("My Errors are " + ErrorCode);


            logger = reports.startTest("womenTabs");
            logger.log(LogStatus.INFO,"Navigate to Express home page");
            driver.navigate().to("https://www.express.com");



            //Verify title
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Express - Men's & Women's Clothing ")) {
                System.out.println("Title Matches"+ actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);

            }




            Reusable_Actions_Loggers.mouseHover(driver,"//*[contains(@href,'womens-clothing?W_HEADER_WOMENSCLOTHING')]",logger,"Womens's Tab");

            Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@href,'womens-clothing/dresses/cat550007')]", logger, "Dresses");

            Thread.sleep(1500);

            Reusable_Actions_Loggers.scrollMethod(driver,"0", "500","scroll");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[@id='onetrust-accept-btn-handler']",logger,"close pop-up");
            Reusable_Actions_Loggers.clickMethod(driver,"//button[@name='bluecoreCloseButton']",logger,"close popup");

            Reusable_Actions_Loggers.clickByIndex(driver,"//*[@class='cdS1D9eKI7bXTMHp5xeAA']",1,logger,"Click on Image by index Number");

            Thread.sleep(1500);


            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+size+"']",logger,"Size");


            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Add to Bag']",logger,"Add to Bag");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='View Bag']",logger,"View Bag");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+quantity+"']",logger,"quantity");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout']",logger,"click on checkout");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout as Guest']",logger,"check out as guest");

            Thread.sleep(1500);

            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='firstname']",firstName,logger,"firstname");

            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='lastname']",lastName,logger,"lastname");

            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='email']",email,logger,"email");

            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='confirmEmail']",email,logger," re enter email");

            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='phone']",phoneNumber,logger," PhoneNumber");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"click on continue");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"click on continue");

            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.line1']",address,logger," address");

            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.postalCode']",zipcode,logger,"zipcode");

            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.city']",city,logger,"city");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='shipping.state']",logger,"state");

            Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@name='shipping.state']",state,logger,"state");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"Continue");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"Continue");

            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='creditCardNumber']",cardNumber,logger,"creditcardnumber");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='expMonth']",logger,"ExpMo");

          Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@name='expMonth']",ExpMo,logger,"expMonth");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='expYear']",logger,"expMonth");

            Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@name='expYear']",ExpYear,logger,"ExpYear");

            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='cvv']",SecCode,logger,"cvv");

            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Place Order']",logger,"Place Order");

            String result = Reusable_Actions_Loggers.getTextMethod(driver,"//*[@class='_2paT8dZ2 _1gNCYBQ3']",logger,"ErrorMessage");
            System.out.println("The Error is "+result);




//Step 5: storing the values to the writable excel sheet
            Label label = new Label(14,i,result);
            //I need to write back to the writable sheet
            writableSheet.addCell(label);

            driver.manage().deleteAllCookies();


//increment
            i = i+1;
        }//end of loop


        //Step 6: writing back to the writable file to see
        reports.endTest(logger);
        writableFile.write();
        writableFile.close();


    }//end of test case one


    @AfterSuite
    public void endSession(){
        driver.quit();
        reports.flush();
    }





}// end of Java class






