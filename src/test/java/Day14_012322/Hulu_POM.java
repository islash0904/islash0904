package Day14_012322;

import Hulu.BaseClass_2;
import Reusable_Library.Reusable_Annotation;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class Hulu_POM extends Reusable_Annotation {


    @Test
            public void Verify_Huu_Tabs(){
        logger.log(LogStatus.INFO,"Navigating to Hulu home page");
        driver.navigate().to("https://www.hulu.com");

        BaseClass_2.homePage_2().SelectButton();

        BaseClass_2.create_your_account_2().Emails("ashgarfs564@gmail.com");



    }




}
