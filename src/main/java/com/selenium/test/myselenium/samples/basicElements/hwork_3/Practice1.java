package com.selenium.test.myselenium.samples.basicElements.hwork_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prd.canvusapps.com/signup");
        //Fill all the mandatory fields
        driver.findElement(By.cssSelector("#user_name")).sendKeys("Elena Ovcharenko");
        driver.findElement(By.cssSelector("#user_email")).sendKeys("alenka134@gmail.com");
        driver.findElement(By.cssSelector("#user_password")).sendKeys("12345");
        driver.findElement(By.cssSelector("#user_password_confirmation")).sendKeys("12345");
        driver.findElement(By.cssSelector("#company_name")).sendKeys("MES");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".submit.btn.btn-primary")).click();
        Thread.sleep(1000);
        driver.quit();

    }
}
