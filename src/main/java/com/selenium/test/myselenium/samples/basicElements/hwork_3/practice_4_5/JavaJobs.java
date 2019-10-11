package com.selenium.test.myselenium.samples.basicElements.hwork_3.practice_4_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JavaJobs {
    WebDriver driver;

    public JavaJobs(WebDriver driver) {
        this.driver = driver;
    }

    public void printJavaJobs() throws InterruptedException {
        List<WebElement> searchLinks = ((ChromeDriver) driver).findElementsByPartialLinkText("Java");
        System.out.println("*****************\nApply your CV to:\n*****************");
        for (WebElement link : searchLinks) {

            System.out.println("- " + link.getText()); //Print only the jobs that has ‘java’ in it
            Thread.sleep(2000);

        }
    }
}

//Click on each link, and search for the word “java”
//Return to the main page
