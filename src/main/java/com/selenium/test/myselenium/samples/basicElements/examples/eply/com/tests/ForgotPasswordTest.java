package com.selenium.test.myselenium.samples.basicElements.examples.eply.com.tests;

import com.selenium.test.myselenium.samples.basicElements.examples.eply.com.pageobjects.ForgotPasswordPage;
import com.selenium.test.myselenium.samples.basicElements.examples.eply.com.pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ForgotPasswordTest {
    static WebDriver driver;
    // static String baseUrl;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://events.eply.com/login/index.aspx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.forgotPassword();

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        forgotPasswordPage.forgotPassword("gal@gmail.com");

        String message = forgotPasswordPage.getMessage();
        if (message.toLowerCase().contains("instructions on how to reset your password have been sent to the email address registered with the username provided")){
            System.out.println("Test was succeed");
        }
else {
            System.out.println("Test fail");
        }
    }
}
