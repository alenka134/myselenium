package com.selenium.test.myselenium.samples.basicElements.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SampleSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://blog.wecodeyoursite.com/samples/bootstrap3/bootstrap-signup-form.htm");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Select sMonthSelection = new Select(driver.findElement(By.xpath("//div[@class='col-md-5']/Select")));
        List<WebElement> sm = sMonthSelection.getOptions();

        for (WebElement s:sm){
            System.out.println("Selection text: " + s.getText());
        }
        System.out.println("Number of options in month list is: " + sm.size());
        sMonthSelection.selectByVisibleText("March");
    }
}
