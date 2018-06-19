package com.rulla.tests;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSubscrible extends WebDriverSetings {

    @Test
    public void subscrible() {
        driver.get("https://ca.rulla.com/account/login.html");
        WebElement Loginfield = driver.findElement(By.id("LoginForm_email"));
        Loginfield.sendKeys("zhogov@trud.com");
        WebElement Password = driver.findElement(By.id("LoginForm_password"));
        Password.sendKeys("awdasd");
        WebElement LoginButton = driver.findElement(By.xpath("//button[1]"));
        LoginButton.click();
        WebElement ButtonSettings = driver.findElement(By.xpath("//a[3]"));
        ButtonSettings.click();
        driver.get("https://ca.rulla.com/office/createsubscription.html");
        WebElement cityField = driver.findElement(By.id("CrmCreateSubForm_region_0"));
        cityField.sendKeys("Toronto");
        WebElement vocationField = driver.findElement(By.id("CrmCreateSubForm_query_0"));
        vocationField.sendKeys("Acquisition Logistics Analyst");
        WebElement subscribeAcc = driver.findElement(By.xpath("//button[@type='submit']"));
        subscribeAcc.click();
        WebElement subscribleText = driver.findElement(By.xpath("//span[@class='req-title']"));
        String textsub = subscribleText.getText();
        Assert.assertSame("Jobs Acquisition Logistics Analyst in Toronto", "Jobs Acquisition Logistics Analyst in Toronto");
        WebElement deleteButton = driver.findElement(By.xpath("//span[@data-gatrackname='unsubscribeAccInSubscriptionsDelete']"));
        deleteButton.click();
    }
}
