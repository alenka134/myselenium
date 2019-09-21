package com.selenium.test.myselenium.samples.basicElements.hwork_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.alitalia.com/en_il"); //1- Open this site

        //2- Find all links on page (elements of type a)
         List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //3- Print list of all link’s text
        for (WebElement link : allLinks) {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }

        System.out.println("**********************************************************");
        //4- Search for links that contains ‘flight’ and print those links
        List<WebElement> searchLinks = ((ChromeDriver) driver).findElementsByPartialLinkText("flight");
        for (WebElement link : searchLinks) {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
