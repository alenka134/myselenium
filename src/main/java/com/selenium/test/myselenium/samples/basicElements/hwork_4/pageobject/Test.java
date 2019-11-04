package com.selenium.test.myselenium.samples.basicElements.hwork_4.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Test extends BasePage {
    WebElement btnNewTaskAdv;
    WebElement date;
    WebElement taskArea;
    WebElement noteArea;
    WebElement tagsArea;
    WebElement btnSave;


    public Test(WebDriver driver) {
        super(driver);
        btnNewTaskAdv = driver.findElement(By.cssSelector("#newtask_adv"));
        date = driver.findElement(By.xpath("//*[@id='duedate']"));
        taskArea = driver.findElement(By.xpath("//*[@id='taskedit_form']/div[4]/input"));
        noteArea = driver.findElement(By.xpath("//textarea[@name='note']"));
        tagsArea = driver.findElement(By.xpath("//input[@type='text'][@name='tags']"));
        btnSave = driver.findElement(By.cssSelector("input[type=submit][value='Save']"));
    }

    public void clickAddTask() {
        btnNewTaskAdv.click();
    }

    public void fillTaskWindow() {
        Select sPrioritySelection = new Select(driver.findElement(By.xpath("//div[@class='form-row form-row-short']/Select")));
        List<WebElement> sPrioritySelectionOptions = sPrioritySelection.getOptions();
        //Select Priority
        for (WebElement s : sPrioritySelectionOptions) {
            System.out.println("Selection priority: " + s.getText());
        }
        System.out.println("Number of priority options in list is: " + sPrioritySelectionOptions.size());
        sPrioritySelection.selectByValue("2");
        // Fill Date
        date.sendKeys("01/11/2019");
        // Clear and enter new task
        taskArea.clear();
        taskArea.sendKeys(" +Elena's new Se task");
        //Enter note
        noteArea.sendKeys("Elena should finish all Selenium HW");
        //Enter tag
        tagsArea.sendKeys("Selenium");
        //Tap Save button
        btnSave.click();
    }

    //Add additional test with other parameters
    public void clickAddNewTask() {
        btnNewTaskAdv.click();
    }

    public void fillNewTaskWindow() {
        Select sPrioritySelection = new Select(driver.findElement(By.xpath("//div[@class='form-row form-row-short']/Select")));
        sPrioritySelection.selectByValue("1");
        date.sendKeys("10/11/2019");
        taskArea.clear();
        taskArea.sendKeys(" +Elena's additional new test Se task");
        noteArea.sendKeys("Enter additional notes, tags, comments ");
        tagsArea.sendKeys("Automation");
        btnSave.click();
    }
}

