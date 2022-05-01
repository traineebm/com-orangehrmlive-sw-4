package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {

    LoginPage loginPg = new LoginPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        loginPg.clickOnForgotPasswordLink();
        String actualMessage = loginPg.getForgotPasswordText();
        Assert.assertEquals(actualMessage,"Forgot your password?", "Login page not displayed");
    }
}
