package com.selenium.test.myselenium.samples.basicElements.hwork_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prd.canvusapps.com/signup"); //1- Open this site
        //2- Enter all information
        driver.findElement(By.cssSelector("#user_name")).sendKeys("Elena Ovcharenko");
        driver.findElement(By.cssSelector("#user_email")).sendKeys("");
        driver.findElement(By.cssSelector("#user_password")).sendKeys("12345");
        driver.findElement(By.cssSelector("#user_password_confirmation")).sendKeys("12345");
        driver.findElement(By.cssSelector("#company_name")).sendKeys("Medical Electronic Systems");
        Thread.sleep(2000);

        //3- "Sign up" with get error
        driver.findElement(By.cssSelector(".submit.btn.btn-primary")).click();

       //4- Print the text with error message
        String errorMessage = driver.findElement(By.cssSelector(".alert.alert-error.alert-block.error")).getText();
        System.out.println("Print the text of the main error message: " + errorMessage);

        //5-6 tap the links ‘already an existing user’ and ‘Forgotten Password’
        driver.findElement(By.cssSelector("#signup>form>div.row-fluid>div.span6.text-right>small>a")).click();
        driver.findElement(By.cssSelector("#loginContainer>div:nth-child(2)>div>form>fieldset>p>a")).click();

        //7- Verify is it a correct page opened
        String text = driver.findElement(By.cssSelector(".offset3.span6.loginForm")).getText();
        if (text.contains("Forgot Your Password")) {
            System.out.println("This is a correct page");
        } else {
            System.out.println("Expected text is not founded, this is a wrong browser page");
        }
        //8- enter e-mail
        driver.findElement(By.cssSelector("#email")).sendKeys("alenka134@gmail.com");
        Thread.sleep(2000);
        //9- Press the ‘Reset Password’ button
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        Thread.sleep(1500);
        driver.quit();
    }
}
