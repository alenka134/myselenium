package com.selenium.test.myselenium.samples.basicElements.hwork_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.InetAddress;

public class Practice6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://whatismyipaddress.com/");

        Thread.sleep(1000);
        String ip = driver.findElement(By.cssSelector("#ipv4")).getText();
        System.out.println("Your IP is: " + ip);

        WebDriver driverRipe = new ChromeDriver();
        driverRipe.manage().window().maximize();
        driverRipe.get("http://ripe.net/");
        driverRipe.findElement(By.cssSelector("#searchtext")).sendKeys(ip);
        Thread.sleep(1000);

        driverRipe.findElement(By.cssSelector("#whois-search > form > div > button > i")).click();
        driverRipe.manage().window().maximize();
        Thread.sleep(3000);

        //Print out all the blocks
        String s = driverRipe.findElement(By.cssSelector("#resultsSection")).getText();
        System.out.println("All screen text: \n" + s);
        System.out.println("****************************************");
        String ss = driverRipe.findElement(By.xpath("//*[@id='resultsSection']/div/div[4]/div/lookup/div/whois-object-viewer/pre/ul")).getText();
        //Print out the 3rd block, because I have not the 2nd block information, it depends from my MAC private settings
        System.out.println("All screen text from 3rd block: \n" + ss);
        Thread.sleep(1000);

        driver.quit();
        driverRipe.quit();
    }
}
