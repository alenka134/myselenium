package com.selenium.test.myselenium.samples.basicElements.hwork_1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exe2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("forgot_password_link")).click();
        driver.quit();

        WebDriver driver1 = new ChromeDriver(); // Get the new URL title "forgot password" page
        driver1.manage().window().maximize();
        driver1.get("https://login.salesforce.com/secur/forgotpassword.jsp?locale=us");

        String titleString = driver1.findElement(By.cssSelector("#header.mb12")).getText();
        System.out.println("Check if the string contains the words: " + titleString);

        assertTrue(titleString.contains("Forgot Your Password"));
        WebElement ts = driver1.findElement(By.cssSelector("#header.mb12"));

        if (ts.getText().contains("Forgot Your Password")) {
            System.out.println("Continue with flow -->");
            driver1.findElement(By.cssSelector("#un")).sendKeys("Elena"); //add my username
            Thread.sleep(2000);
            driver1.findElement(By.cssSelector("#continue")).click();

            String alertString = driver1.findElement(By.cssSelector(".mb16.error")).getText();
            System.out.println("An alert message -> NO ID we cannot do it for now :) " + alertString);
            driver1.quit();
        }
        System.out.println("mismatch to searched words ");
    }
}
