package Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotation;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_In extends Reusable_Annotation {

    ExtentTest logger;
    public Log_In(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation.logger;
    }//end of the constructor method

@FindBy(xpath = "//*[@class='navigation__login-button navigation__action-button navigation__cta']")
    WebElement LogIn;
    @FindBy(xpath = "//*[@id='email_id']")
    WebElement emailid;
    @FindBy(xpath = "//*[@id='password_id']")
    WebElement passWord;
    @FindBy(xpath = "//*[@class='jsx-4282396490 button-dark login-button']")
    WebElement LogInAccount;

    public void login(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,LogIn,logger,"LogIn");

    }//

    public void EmailId(){

        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,emailid,"ashgarfs564@gmail.com",logger,"emailId");

    }//

    public void code() {

        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,passWord,"transform90$#",logger,"passWord");

    }//

    public void loginAccount() {

        Reusable_Actions_Loggers_POM.clickMethod(driver,LogInAccount,logger,"LogInAccount");

    }//



}//
