package com.orangehrmlive.opensource_demo.pages;


import com.orangehrmlive.opensource_demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//a[@id='welcome']");
    By usernameField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginButton = By.xpath("//input[@id='btnLogin']");
    By forgotPasswordLink = By.linkText("Forgot your password");
    By forgotPasswordText = By.xpath("//a[contains(text(),'Forgot your password?')]");

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterUsernameField(String name){
         sendTextToElement(usernameField, name);
    }

    public void enterPasswordField(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public void clickOnForgotPasswordLink(){
        clickOnElement(forgotPasswordLink);
    }

    public String getForgotPasswordText(){
        return getTextFromElement(forgotPasswordText);
    }
}


