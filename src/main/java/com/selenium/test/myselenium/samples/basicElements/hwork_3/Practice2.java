package com.selenium.test.myselenium.samples.basicElements.hwork_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");

        //Fill in the User +Password + Remember me
        driver.findElement(By.cssSelector("#username")).sendKeys("alenka134");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345");
        driver.findElement(By.cssSelector("#rememberUn")).click();
        Thread.sleep(2000);
        //Click on ‘Login’ button
        driver.findElement(By.cssSelector("#Login")).click();

        //Get the error message and print it
        String errorMessage1 = driver.findElement(By.cssSelector("#error")).getText();
        System.out.println("Received the 1st error message: " + errorMessage1);

        //Click the ‘Forgot your password’ link
        driver.findElement(By.cssSelector("#forgot_password_link")).click();

        //Insert your name  and Click ‘Continue’ button
        driver.findElement(By.cssSelector(".input.wide.mb12.mt8.username")).sendKeys("alenka134");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#continue")).click();

        //Get the error message and print it
        String errorMessage2 = driver.findElement(By.cssSelector(".mb16.error")).getText();
        System.out.println("Received the 2nd error message: " + errorMessage2);
        Thread.sleep(2000);
        driver.quit();
    }
}






