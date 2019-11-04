package com.selenium.test.myselenium.samples.basicElements.examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    static WebDriver driver;
    // static String baseUrl;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

        driver.switchTo().frame("iframeResult");

        WebElement weButtonTryIt = driver.findElement(By.xpath("//button"));
        weButtonTryIt.click();

        Alert alert = driver.switchTo().alert();

        Thread.sleep(3000);
        System.out.println("Message of Alert: " + alert.getText());

       // alert.accept();
        alert.dismiss();
        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("iframeResult");
        WebElement webMessage = driver.findElement(By.xpath(".//*[@id='demo']"));

        System.out.println("Message is: " + webMessage.getText());
        Thread.sleep(3000);
       // driver.quit();
    }
}