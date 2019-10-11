package com.selenium.test.myselenium.samples.basicElements.hwork_3.practice_4_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchLink {
    WebDriver driver;

    public SearchLink(WebDriver driver) {
        this.driver = driver;
    }

    public void printAllJobs() throws InterruptedException {

        //Get list of all jobs
        List<WebElement> allLinks = driver.findElements(By.cssSelector("#comp-jilghhzxinlineContent"));

        for (WebElement link : allLinks) {

            System.out.println("All positions list: " + link.getText());
            Thread.sleep(5000);
        }
        System.out.println("*****************\n List Java jobs:\n*****************");

        //4- Search for links that contains ‘java’ and print those links
        List<WebElement> allJavaLinks = ((ChromeDriver) driver).findElementsByPartialLinkText("Java");

        for (WebElement link : allJavaLinks) {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
            Thread.sleep(2000);
        }
    }
}
