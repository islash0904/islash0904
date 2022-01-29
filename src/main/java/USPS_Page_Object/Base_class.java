package USPS_Page_Object;

import Reusable_Library.Reusable_Annotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_class extends Reusable_Annotation {

    public Base_class(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class

    //create static reference for usps home page
    public static HomePage homepage(){
        HomePage homepage = new HomePage(driver);
        return  homepage;
    }

    //create static reference for send mail and packages page
    public static SendMails_And_Packages sendMailAndPackages(){
        SendMails_And_Packages SendMailAndPackages = new SendMails_And_Packages(driver);
        return  SendMailAndPackages;
    }




}




