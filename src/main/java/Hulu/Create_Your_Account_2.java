package Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotation;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Create_Your_Account_2 extends Reusable_Annotation {


    ExtentTest logger;
    public Create_Your_Account_2(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation.logger;
    }//end of the constructor method

//define all webelement on this page
    @FindBy(xpath = "//*[@id='email']")
    WebElement Emails;

    @FindBy(xpath = "//*[@id='password']")
    WebElement PassWords;
    @FindBy(xpath = "//*[@id='firstName']")
    WebElement Names;
    @FindBy(xpath = "//*[@class = 'selector-selected input__text placeholder']")
    WebElement Month;
    @FindBy(xpath = "//*[@id='birthdayMonth-menu']")
    WebElement birthMonth;
    @FindBy(xpath = "//*[@class = 'selector-selected input__text placeholder']")
    WebElement birthDay;
    @FindBy(xpath = "//*[@id='birthdayDay-menu']")
    WebElement BirthDay;
    @FindBy(xpath = "//*[@class = 'selector-selected input__text placeholder']")
    WebElement birthYear;
    @FindBy(xpath = "//*[@id = 'birthdayYear-menu']")
    WebElement BirthYear;
    @FindBy(xpath = "//*[@class = 'selector-selected input__text placeholder']")
    WebElement Gender;
    @FindBy(xpath = "//*[@id = 'gender-menu']")
    WebElement gender;
    @FindBy(xpath = "//*[@class = 'button button--continue ']")
    WebElement ContinueButton;

    public void Emails(String userData) {

        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, Emails, "ashgarfs564@gmail.com", logger, "Emails");
    }
    public void PassWords(String userData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, PassWords, "transform90$#", logger, "Password");
    }

    public void Names(String userData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, Names, "Johnathan", logger, "Names");
    }

    public void ClickMonth() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,Month,logger,"birthMonth");

    }

    public void SelectMonmth(){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,birthMonth,logger,"December","birthMonth");
    }

    public void ClickBirthDay(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,birthDay,logger,"birthDay");
    }//

    public void SelectBirthDay(){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,BirthDay,logger,"17","BirthDay");
    }//

    public void ClickbirthYear(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,birthYear,logger,"birthYear");
    }//

    public void SelectBirthYear(){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,BirthDay,logger,"1985","BirthYear");
    }//

    public void ClickGender(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Gender,logger,"Gender");
    }//

    public void Selectgender(){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,gender,logger,"1985","gender ");
    }//

public void ContinueButton(){

        Reusable_Actions_Loggers_POM.clickMethod(driver,ContinueButton,logger,"Continue");
}//




}
