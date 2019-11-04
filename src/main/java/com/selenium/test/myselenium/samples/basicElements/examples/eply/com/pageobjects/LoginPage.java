package com.selenium.test.myselenium.samples.basicElements.examples.eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    WebElement forgotPasswordLink;

    public LoginPage(WebDriver driver) {
        super(driver);
        forgotPasswordLink = driver.findElement(By.cssSelector("#body_ForgotPasswordButton"));
    }

    //Actions
    public void forgotPassword(){
        click(forgotPasswordLink);

    }
}
