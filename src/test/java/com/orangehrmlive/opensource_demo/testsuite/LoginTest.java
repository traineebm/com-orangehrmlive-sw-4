package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPg = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPg.enterUsernameField("Admin");
        loginPg.enterPasswordField("admin123");
        loginPg.clickOnLoginButton();
        String actualMessage = loginPg.getWelcomeText();
        Assert.assertEquals(actualMessage,"Welcome", "Login page not displayed");
    }


}
