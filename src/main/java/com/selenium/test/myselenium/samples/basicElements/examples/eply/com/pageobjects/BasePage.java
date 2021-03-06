package com.selenium.test.myselenium.samples.basicElements.examples.eply.com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(WebElement el){
        //highlight
        el.click();
    }

    public void fillText(WebElement el, String text){
        el.click();
        el.sendKeys(text);
    }

    public String getText(WebElement el){
        return el.getText();
    }
}
