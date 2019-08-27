package com.selenium.test.myselenium.samples.basicElements.hwork_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ebay.com/sch/ebayadvsearch");

        driver.findElement(By.cssSelector("#_nkw")).sendKeys("tent");
        driver.findElement(By.cssSelector("#_ex_kw")).sendKeys("paper glass ");

        WebElement checkbox = driver.findElement(By.cssSelector("#LH_BIN"));
        System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
//If the checkbox is unchecked then isSelected() will return false
//and NOT of false is true, hence we can click on checkbox
        if (!checkbox.isSelected())
            checkbox.click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#searchBtnLowerLnk")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn.btn-prim")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}