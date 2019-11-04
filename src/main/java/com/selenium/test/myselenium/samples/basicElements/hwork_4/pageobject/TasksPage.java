package com.selenium.test.myselenium.samples.basicElements.hwork_4.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TasksPage extends BasePage {
    WebElement simpleTaskField;
    WebElement btnAddTask;

    public TasksPage(WebDriver driver) {
        super(driver);
        simpleTaskField = driver.findElement(By.cssSelector("#task"));
        btnAddTask = driver.findElement(By.cssSelector("#newtask_submit"));
    }

    //Actions
    public void addSimpleTask() {
        simpleTaskField.sendKeys("Elena added Simple Task");
        btnAddTask.click();
    }
}
