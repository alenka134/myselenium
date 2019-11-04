package com.selenium.test.myselenium.samples.basicElements.examples.eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage extends BasePage{

    WebElement username;
    WebElement submit;
    WebElement message;

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
        username = driver.findElement(By.cssSelector("#body_Username"));
        submit = driver.findElement(By.cssSelector("#body_SubmitButton"));
    }

    public void forgotPassword(String user){
        fillText(username, user);
        click(submit);
    }

    public String getMessage(){
       message = driver.findElement(By.cssSelector("#body_Message"));
        return message.getText();
    }
}
