package com.selenium.test.myselenium.samples.basicElements.hwork_3;

import com.selenium.test.myselenium.samples.basicElements.hwork_3.practice_4_5.JavaJobs;
import com.selenium.test.myselenium.samples.basicElements.hwork_3.practice_4_5.SearchLink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class Practice4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://www.wix.com/jobs/locations/tel-aviv/positions";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch chrome and direct it to the Base URL
        driver.get(baseUrl);
        Thread.sleep(3000);
        List<WebElement> allPositions = driver.findElements(By.cssSelector("#comp-jilghhzxinlineContent"));

        for (WebElement link : allPositions) {
            System.out.println("All positions list: " + link.getText());
            Thread.sleep(3000);
        }
        // Get all links in this page
        List<WebElement> allLinks = driver.findElements(By.cssSelector("a"));
        System.out.println("Links in Page:");
        for (WebElement myElement : allLinks) {
            System.out.println(myElement.getAttribute("href"));
        }

        // Click on each link, and search for the word 'java'
        System.out.println("\nJava Jobs:");
        System.out.println("**********");
        for (int j = 0; j < allPositions.size(); j++) {
            driver.findElements(By.cssSelector("a"));
            allPositions.get(j).click();
            Thread.sleep(3000);

            List<WebElement> allJavaLinks = ((ChromeDriver) driver).findElementsByPartialLinkText("Java");

            for (WebElement link : allJavaLinks) {
                System.out.println(link.getText() + " - " + link.getAttribute("href"));
                Thread.sleep(2000);
            }
            driver.quit();
        }
    }
}