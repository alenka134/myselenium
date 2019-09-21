package com.selenium.test.myselenium.samples.basicElements.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MySelenium {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is my first automation program");

        // System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");
        // WebDriver driver = new ChromeDriver();

        //  System.setProperty("webdriver.geckodriver", "/usr/local/Cellar/geckodriver/0.24.0");
        // WebDriver driver = new FirefoxDriver();

        //we don't need download any driver
        WebDriver driver = new SafariDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("download selenium");
        Thread.sleep(1000);

    }
}



