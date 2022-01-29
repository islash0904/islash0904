package Best_Buy;

import Day9_010822.Reusable_Action;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Best_Buy {


    WebDriver driver;

    @BeforeSuite
    public void setDriver(){driver = Reusable_Action.setDriver();
    }

@Test(priority = 1)
 public void BestBuyMacBook(){





        driver.navigate().to("https://www.bestbuy.com");


        String actualTitle= driver.getTitle();
        if (actualTitle.equals("Best Buy | Official Online Store | Shop Now & Save")) {
            System.out.println("Title Matches as 'Best Buy | Official Online Store | Shop Now & Save'");
        }else {
            System.out.println("Title doesn't match. Actual Title is " + actualTitle);
        }//end of Title

Reusable_Action.scrollMethod(driver,"0","3000","Scroll");

Reusable_Action.clickMethod(driver,"//*[@class='c-close-icon-svg']","dismiss");

        Reusable_Action.clickMethod(driver,"//*[@id='gh-search-input']","click on search field");

        Reusable_Action.sendKeysMethod(driver,"//*[@id='gh-search-input']","macbook","macbook");

        Reusable_Action.clickMethod(driver,"//*[@class='header-search-icon']","search button");

        Reusable_Action.clickMethod(driver,"//*[@class='image-column']","macbook Selection");

        Reusable_Action.clickMethod(driver,"//*[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button']","Add To Cart");

       Reusable_Action.clickMethod(driver,"//*[@data-button-state='ADD_TO_CART']","Add To Cart");

       Reusable_Action.clickMethod(driver,"//*[@class='c-button c-button-secondary c-button-sm c-button-block ']","Go To Cart");

       Reusable_Action.clickMethod(driver,"//*[@class='btn btn-lg btn-block btn-primary']","CheckOut");

       Reusable_Action.clickMethod(driver,"//*[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']","Continue As Guest");

       Reusable_Action.sendKeysMethod(driver,"//*[@name='firstName']","Ashraful","First Name");

       Reusable_Action.sendKeysMethod(driver,"//*[@name='lastName']","Islam","Last Name");

       Reusable_Action.sendKeysMethod(driver,"//*[@class='tb-input  autocomplete__input']","182 South Street","Address");

       Reusable_Action.sendKeysMethod(driver,"//*[@id='city']","Buffalo","City");

       Reusable_Action.clickMethod(driver,"//*[@class='tb-select']","Select State");
       Reusable_Action.SelectMethod(driver,"//*[@id='state']","NY","New York");

       Reusable_Action.sendKeysMethod(driver,"//*[@id='zipcode']","10031","Zipcode");

       Reusable_Action.clickMethod(driver,"//*[@class='c-checkbox-input']","Checkbox");

       Reusable_Action.sendKeysMethod(driver,"//*[@id='user.emailAddress']","transform678@gmail.com","emailaddress");

       Reusable_Action.sendKeysMethod(driver,"//*[@id='user.phone']","786-876-9087","PhoneNumber");

       Reusable_Action.clickMethod(driver,"//*[@id='text-updates']","Click Check to Get Updates");

       Reusable_Action.clickMethod(driver,"//*[@class='btn btn-lg btn-block btn-secondary']","Continue to payment");

driver.manage().deleteAllCookies();

}//end of test

    @Test(dependsOnMethods = "BestBuyMacBook")
    public void WindowsLaptop(){

        driver.navigate().to("https://www.bestbuy.com");

        Reusable_Action.scrollMethod(driver,"0","3000","Scroll");

        Reusable_Action.clickMethod(driver,"//*[@class='c-close-icon-svg']","dismiss");

        Reusable_Action.clickMethod(driver,"//*[@id='gh-search-input']","click on search field");

        Reusable_Action.sendKeysMethod(driver,"//*[@id='gh-search-input']","hp laptop","hp laptop");

        Reusable_Action.clickMethod(driver,"//*[@class='header-search-icon']","search button");

       Reusable_Action.clickMethod(driver,"//*[@class='sku-header']","hp window selection");

        Reusable_Action.clickMethod(driver,"//*[@data-button-state='ADD_TO_CART']","Add To Cart");

        Reusable_Action.clickMethod(driver,"//*[@class='c-button c-button-secondary c-button-sm c-button-block ']","Go To Cart");

        Reusable_Action.clickMethod(driver,"//*[@class='btn btn-lg btn-block btn-primary']","CheckOut");

        Reusable_Action.clickMethod(driver,"//*[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']","Continue As Guest");

        Reusable_Action.sendKeysMethod(driver,"//*[@name='firstName']","james","First Name");

        Reusable_Action.sendKeysMethod(driver,"//*[@name='lastName']","samuel","Last Name");

        Reusable_Action.sendKeysMethod(driver,"//*[@class='tb-input  autocomplete__input']"," Hertal ave","Address");

        Reusable_Action.sendKeysMethod(driver,"//*[@id='city']","Buffalo","City");

        Reusable_Action.clickMethod(driver,"//*[@class='tb-select']","Select State");
        Reusable_Action.SelectMethod(driver,"//*[@id='state']","NY","New York");

        Reusable_Action.sendKeysMethod(driver,"//*[@id='zipcode']","10001","Zipcode");

        Reusable_Action.clickMethod(driver,"//*[@class='c-checkbox-input']","Checkbox");

        Reusable_Action.sendKeysMethod(driver,"//*[@id='user.emailAddress']","transform09788@gmail.com","emailaddress");

        Reusable_Action.sendKeysMethod(driver,"//*[@id='user.phone']","786-846-9953","PhoneNumber");

        Reusable_Action.clickMethod(driver,"//*[@id='text-updates']","Click Check to Get Updates");

        Reusable_Action.clickMethod(driver,"//*[@class='btn btn-lg btn-block btn-secondary']","Continue to payment");


    }//end of test case 2


    @AfterSuite
    public void endSession(){
        driver.quit();
    }




}//end of class
