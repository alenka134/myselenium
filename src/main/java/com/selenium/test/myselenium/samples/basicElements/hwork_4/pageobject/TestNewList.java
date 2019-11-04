package com.selenium.test.myselenium.samples.basicElements.hwork_4.pageobject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TestNewList extends BasePage {
    WebElement btnAddNewList;
    WebElement newList;
    WebElement simpleTaskField;
    WebElement btnAddTask;

    public TestNewList(WebDriver driver) {
        super(driver);
        btnAddNewList = driver.findElement(By.cssSelector("#lists > div.mtt-tabs-add-button"));
        simpleTaskField = driver.findElement(By.cssSelector("#task"));
        btnAddTask = driver.findElement(By.cssSelector("#newtask_submit"));
    }

    public void clickBtnAddNewList() throws InterruptedException {
        btnAddNewList.click();
        Thread.sleep(3000);
    }

    public void createNewList() throws InterruptedException {

        try {
            Thread.sleep(5000);
            // sure you are not checking for the alert too soon.
            Alert alt = driver.switchTo().alert();
            alt.sendKeys("Elena List");
            alt.accept();

        } catch (NoAlertPresentException noe) {
            // No alert found on page, proceed with test.
        }
    }

    public void clickNewList() throws InterruptedException {
        newList = driver.findElement(By.xpath("//span[text()='Elena List']"));
        Thread.sleep(3000);
        newList.click();
    }

    //Actions

    public void addSimpleTask() {
        simpleTaskField.sendKeys("Elena added the Simple Task in the 2nd list");
        btnAddTask.click();
        btnAddTask.click();
    }

    //Check that in the list are 2 tasks
    public void taskCheckList() throws InterruptedException {
       List<WebElement> allTaskSearched = driver.findElements(By.cssSelector("span[id='total']"));

        for (WebElement taskNumber : allTaskSearched) {
            System.out.println("\nTasks Number in the 2nd list --> " + taskNumber.getText());
            Thread.sleep(3000);
        }
    }
}
