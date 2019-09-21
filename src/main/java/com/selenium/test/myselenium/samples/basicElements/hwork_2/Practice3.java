package com.selenium.test.myselenium.samples.basicElements.hwork_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.echoecho.com/htmlforms10.htm"); //1- Open this site

        //2- Click the second option in the radio buttons
        driver.findElement(By.cssSelector("td.table8 > input[type=radio]:nth-child(2)")).click();
        //3-4 Click the first option in the radio buttons and output result
        // <input type="radio" name="group1" value="Milk"
        //input[type=radio]:nth-child(3)
        //input type="radio" name="group2" value="Water"
        driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]")).click();
        String s1 = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]")).getAttribute("value");
        driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[4]")).click();
        String s2 = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[4]")).getAttribute("value");
        System.out.println("output 1 is: " + s1 + " and output 2 is: " + s2);
    }
}
