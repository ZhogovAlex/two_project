package com.rulla.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestUnregistSub extends WebDriverSetings {

    @Test
    public void unregistSub() {
        driver.get("https://uk.rulla.com/jobs/");
        WebElement subForm = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        subForm.sendKeys("zhogov+09123@trud.com");
        WebElement subButton1 = driver.findElement(By.xpath("//button[@class='btn btn-blue-shd rippled']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", subButton1);

    }
}
