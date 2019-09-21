package com.selenium.test.myselenium.samples.basicElements.hwork_2.practice_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebPage {
    WebDriver driver;

    public WebPage(WebDriver driver) {
        this.driver = driver;
    }

    public void webResultList() throws InterruptedException {

        for (int i = 1; i < 11; i++) {
            driver.findElement(By.cssSelector("#search > div.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(9) > div > div > div > ul > li.a-last > a")).click();
            List<WebElement> searchLinks = ((ChromeDriver) driver).findElementsByCssSelector(".a-size-medium.a-color-base.a-text-normal");
            for (WebElement link : searchLinks) {
                System.out.println(i + " page - " + link.getText());
                Thread.sleep(500);
            }
        }
    }
}
