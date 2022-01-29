package Ationitem_5;

import Day9_010822.Reusable_Action;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hulu_TV_MOVIES_Actions {


    WebDriver driver;

    @BeforeSuite
    public void setTheDriver(){driver = Reusable_Action.setDriver(); }// end of precondtion




    @Test(priority = 1)
    public void googleSearchLoop() {


        ArrayList<String> emails = new ArrayList<>();

        emails.add("sandths9879887874487@gmail.com");
        emails.add("giveugf9987075678 9687@gmail.com");


        ArrayList<String> passwords = new ArrayList<>();

        passwords.add("123456");
        passwords.add("678910");



        ArrayList<String> Names = new ArrayList<>();

        Names.add("Tim");
        Names.add("Horton");


        ArrayList<String> birthMonth = new ArrayList<>();

        birthMonth.add("December");
        birthMonth.add("October");


        ArrayList<String> birthDay = new ArrayList<>();

        birthDay.add("17");
        birthDay.add("16");


        ArrayList<Integer> birthYear = new ArrayList<>();

        birthYear.add(1985);
        birthYear.add(1975);


        ArrayList<String> gender = new ArrayList<>();

        gender.add("Male");
        gender.add("Female");

        for (int i = 0; i < emails.size(); i++) {



            //navigating to
            driver.navigate().to("https://www.hulu.com");



            //Verify title
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Stream TV and Movies Live and Online | Hulu")) {
                System.out.println("Title matches as 'Stream TV and Movies Live and Online | Hulu'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);

            }



            // Scroll down
            Reusable_Action.scrollMethod(driver,"0", "3250","scroll");


            //click on select botton
            Reusable_Action.clickMethod(driver,"//*[@aria-label='Get Hulu plan']","Select Button");


            //on enter email

            Reusable_Action.sendKeysMethod(driver,"//*[@id='email']" ,emails.get(i),"email");

            //enter Password

            Reusable_Action.sendKeysMethod(driver,"//*[@id='password']" ,passwords.get(i),"password");

            Reusable_Action.sendKeysMethod(driver,"//*[@id='firstName']" ,Names.get(i),"Names");

            //select value from birthmonth
            Reusable_Action.clickMethod(driver,"//*[@class = 'selector-selected input__text placeholder']","birthmonth");
            Reusable_Action.SelectMethod(driver,"//*[@id='birthdayMonth-menu']" ,birthMonth.get(i),"birthmonth");


            //select select value from birthday
            Reusable_Action.clickMethod(driver,"//*[@class = 'selector-selected input__text placeholder']","birthday");
            Reusable_Action.SelectMethod(driver,"//*[@id='birthdayDay-menu']" ,birthDay.get(i),"birthday");


            //select value from birthyear

            Reusable_Action.clickMethod(driver,"//*[@class = 'selector-selected input__text placeholder']","birthyear");
            Reusable_Action.SelectMethod(driver,"//*[@id = 'birthdayYear-menu']" ,+birthYear.get(i)+"", "birthyear");


            //select value from gender
            Reusable_Action.clickMethod(driver,"//*[@class = 'selector-selected input__text placeholder']","birthyear");
            Reusable_Action.SelectMethod(driver,"//*[@id = 'gender-menu']" , gender.get(i), "male");


            //select coninue
            Reusable_Action.clickMethod(driver," ","Continue");

            //capture text


            String result = Reusable_Action.getTextMethod(driver, "//*[@class='ledger__content']", "capture subcription amount");
           System.out.println("My subscription amount " + result);

            //capture total amount due
            String results = Reusable_Action.getTextMethod(driver, "//*[@class='panel large'][2]", "capture total amount due");
            System.out.println("My total amount due " + results);

                driver.manage().deleteAllCookies();
        }//end for loop

    }//end of test




    @Test(dependsOnMethods =  "googleSearchLoop")
    public void Login() {


        driver.navigate().to("https://www.hulu.com");

        //click on login
        Reusable_Action.clickMethod(driver,"//*[@class='navigation__login-button navigation__action-button navigation__cta']","Log In");


        //Enter email
        Reusable_Action.sendKeysMethod(driver,"//*[@id='email_id']" , "sanctuary287@gmail.com","EnterEmail");


        //Enter password
        Reusable_Action.sendKeysMethod(driver,"//*[@id='password_id']","123456","Password");


        //Click on log in
        Reusable_Action.clickMethod(driver,"//*[@class='jsx-4282396490 button-dark login-button']","Log In Button");


        //verify login by getting user name text on home page
        String username = Reusable_Action.getTextMethod(driver, "//*[text()='Tim']", "get user name text");
       System.out.println("The user name is " + username);
   }//end of @test user case 2



    @AfterSuite
    public void endSession(){
        driver.quit();
    }




    }//end of hulu