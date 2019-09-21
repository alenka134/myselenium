package com.selenium.test.myselenium.samples.basicElements.hwork_2.practice_7;

import com.selenium.test.myselenium.samples.basicElements.hwork_1.exe5.WebPageVisit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebPage webPage = new WebPage(driver);
        driver.manage().window().maximize();
        driver.get(" https://www.amazon.com/");

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("tent");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();

        webPage.webResultList();
        driver.quit();
    }
}
//print the list of the tents in the 10 first pages
// (to do it you should press the next button with a loop,
// in addition you should use Thread.sleep to wait for the results)