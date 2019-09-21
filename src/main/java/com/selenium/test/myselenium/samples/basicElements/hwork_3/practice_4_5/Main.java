package com.selenium.test.myselenium.samples.basicElements.hwork_3.practice_4_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        SearchLink searchLink = new SearchLink(driver);
        JavaJobs javaJobs = new JavaJobs(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.wix.com/jobs/locations/tel-aviv/positions/");

        searchLink.printAllJobs();
        javaJobs.printJavaJobs();

        driver.quit();
    }
}

//Click on each link, and search for the word “java”
//Return to the main page
//Print only the jobs that has ‘java’ in it