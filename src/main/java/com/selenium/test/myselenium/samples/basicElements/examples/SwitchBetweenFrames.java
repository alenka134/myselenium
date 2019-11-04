package com.selenium.test.myselenium.samples.basicElements.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchBetweenFrames {
    static WebDriver driver;
   // static String baseUrl;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/?locale=eu");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement weUserName = driver.findElement(By.cssSelector("#username"));
        weUserName.sendKeys("testing top window");

        driver.switchTo().frame(0);

        WebElement weButton = driver.findElement(By.xpath(".//html/body/div[8]/div/div[6]/div[1]/div/div[3]/div/div/div/a/span"));
       // WebElement weButton = driver.findElement(By.xpath("./html/body/div[8]/div/div[6]/div[1]/div/div[3]/div/div/div/a/span")); //sometimes works this option
        weButton.click();

        driver.switchTo().defaultContent();

        System.out.println("Parent window title: " + driver.getTitle());
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent handle is: " + parentHandle);

        Set<String> handels = driver.getWindowHandles();

        for(String h: handels){
            System.out.println("Current handel is the set is: " + h);
            if(!parentHandle.contains(h)){
                driver.switchTo().window(h);
                break;
            }
        }
        System.out.println("Child window title is: " + driver.getTitle());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(parentHandle);
        System.out.println("Parent window title is back: " + driver.getTitle());

        //driver.quit();
    }
}
