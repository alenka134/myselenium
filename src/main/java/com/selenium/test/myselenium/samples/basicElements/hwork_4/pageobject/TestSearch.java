package com.selenium.test.myselenium.samples.basicElements.hwork_4.pageobject;

import com.selenium.test.myselenium.samples.basicElements.hwork_4.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestSearch extends BasePage {
    WebElement areaSearch;

    public TestSearch(WebDriver driver) {
        super(driver);
        areaSearch = driver.findElement(By.cssSelector("input[type=text][name='search']"));
    }
//Tasks search and count
    public void enterTaskSearch() throws InterruptedException {
        areaSearch.sendKeys("Elena");

        Thread.sleep(3000);
        List<WebElement> allTaskSearched = driver.findElements(By.cssSelector("span[id='total']"));

        for (WebElement taskNumber : allTaskSearched) {
            System.out.println("\nTasks Number corresponded to my search is : " + taskNumber.getText());
            Thread.sleep(3000);
        }
    }
}
