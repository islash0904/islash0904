package Day14_012322;

import Reusable_Library.Reusable_Annotation;
import USPS_Page_Object.Base_class;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class USPS_SHIP_A_LABEL_POM extends Reusable_Annotation {

    @Test
    public void USPS_Verify_Tabs_Then_Ship_A_Label() {

        //navigate to usps
        logger.log(LogStatus.INFO,"Navigating to USPS home page");
        driver.navigate().to("https://www.usps.com");

        //verify the tabs count
        Base_class.homepage().getNavigationTabsCount();

        //click on Send tab
        Base_class.homepage().clickOndSendTab();

        //click on Ship a Label
        Base_class.sendMailAndPackages().clickOnPrintLabelButton();



    }





}
