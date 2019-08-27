package com.selenium.test.myselenium.samples.basicElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSample {
    public static void main(String[] args) {
        WebDriver fireFoxDriver = new FirefoxDriver();
        String baseUrl = "http://elcvsi.online";
        fireFoxDriver.get(baseUrl);
        fireFoxDriver.close();
    }
}
