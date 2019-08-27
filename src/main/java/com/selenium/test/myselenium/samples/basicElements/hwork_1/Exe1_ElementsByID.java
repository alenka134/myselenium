package com.selenium.test.myselenium.samples.basicElements.hwork_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe1_ElementsByID {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.cssSelector("#username")).sendKeys("Elena");
        driver.findElement(By.id("password")).sendKeys("test");

        driver.findElement(By.cssSelector(".r4.fl.mr8")).click(); //option by cssSelector

        WebElement checkbox = driver.findElement(By.cssSelector(".r4.fl.mr8"));
        System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
//If the checkbox is unchecked then isSelected() will return false
//and NOT of false is true, hence we can click on checkbox
        if (!checkbox.isSelected())
            checkbox.click();

        Thread.sleep(2000);
        driver.findElement(By.id("Login")).click();
        driver.quit();
    }
}
