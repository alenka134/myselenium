package com.selenium.test.myselenium.samples.basicElements.hwork_1.exe5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageVisit {
    WebDriver driver;
    public WebPageVisit(WebDriver driver) {
        this.driver = driver;
    }

    // Open url and check if it is 'selenium' site
    public boolean visitPage(String url){
        driver.get(url);
        return isItSeleniumSite();
    }
     // Check if the title contains 'selenium'
    public boolean isItSeleniumSite(){
        String title = driver.getTitle();
        if (title.toLowerCase().contains("selenium"))
            return true;
        return false;
    }
     // Check if the page source contains specific text
    public boolean isTextExist(String text){
        String pageSource = driver.getPageSource();
        if (pageSource.toLowerCase().contains(text.toLowerCase()))
            return true;
        return false;
    }
}







