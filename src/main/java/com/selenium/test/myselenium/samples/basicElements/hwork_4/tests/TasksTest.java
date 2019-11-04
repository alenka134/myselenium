package com.selenium.test.myselenium.samples.basicElements.hwork_4.tests;

import com.selenium.test.myselenium.samples.basicElements.hwork_4.pageobject.TasksPage;
import com.selenium.test.myselenium.samples.basicElements.hwork_4.pageobject.Test;
import com.selenium.test.myselenium.samples.basicElements.hwork_4.pageobject.TestNewList;
import com.selenium.test.myselenium.samples.basicElements.hwork_4.pageobject.TestSearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TasksTest {
    static WebDriver driver;
    // static String baseUrl;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "/Users/alenka/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        TasksPage tasksPage = new TasksPage(driver);
        tasksPage.addSimpleTask();

        Test test = new Test(driver);
        test.clickAddTask();
        test.fillTaskWindow();

        //additional test task
        test.clickAddNewTask();
        test.fillNewTaskWindow();

        //Tasks search and tasks count
        TestSearch testSearch = new TestSearch(driver);
        testSearch.enterTaskSearch();

        //Add new list and input tasks
        TestNewList testNewList = new TestNewList(driver);
        testNewList.clickBtnAddNewList();

        testNewList.createNewList();
        Thread.sleep(3000);

        //Add tasks in the new list & check the list
        testNewList.clickNewList();

        testNewList.addSimpleTask();
        Thread.sleep(3000);
        testNewList.taskCheckList();

    }
}