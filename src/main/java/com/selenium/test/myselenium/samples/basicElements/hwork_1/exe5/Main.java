package com.selenium.test.myselenium.samples.basicElements.hwork_1.exe5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebPageVisit seleniumPage = new WebPageVisit(driver);
        driver.manage().window().maximize();
        String url = "http://www.seleniumhq.org/";
        driver.get(url);
        //Visit the page
        //Get true if it is the correct page
        boolean isItSelenium = seleniumPage.visitPage("http://www.seleniumhq.org/");
        if (isItSelenium)
            System.out.println("The site is Selenium site");

        //Check if specific text exist in the page
        String text = "Selenium WebDriver";
        if (seleniumPage.isTextExist(text))
            System.out.println("The text '" + text + "' exist in this page");
        else
            System.out.println("I didn't find the text '" + text + "' in this page");

        Thread.sleep(2000);
        driver.quit();
    }
}

