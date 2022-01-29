package Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotation;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserName extends Reusable_Annotation  {


    ExtentTest logger;
    public UserName(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation.logger;
    }//end of the constructor method

@FindBy(xpath = "//*[text()='Ashraf']")
    WebElement UserName;


    public String userName () {

        String userName = Reusable_Actions_Loggers_POM.getTextMethod(driver,UserName,logger,"UserName");
        return userName;
    }//




}
