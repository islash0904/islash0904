package Hulu;

import Reusable_Library.Reusable_Annotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass_2 extends Reusable_Annotation {

    public BaseClass_2(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class


    public static HomePage2 homePage_2(){
        HomePage2 homePage2 = new HomePage2(driver);
        return homePage2;
    }

    public static Create_Your_Account_2 create_your_account_2(){
        Create_Your_Account_2 create_your_account_2 = new Create_Your_Account_2(driver);
        return create_your_account_2;

    }//

    public static Amount_page3 amount_page3(){
        Amount_page3 amount_page3 = new Amount_page3(driver);
        return amount_page3;

    }//

    public static Log_In log_in() {
        Log_In log_in = new Log_In(driver);
        return log_in;

    }//

    public static UserName userName() {
        UserName userName = new UserName(driver);
        return  userName
    }//


}
