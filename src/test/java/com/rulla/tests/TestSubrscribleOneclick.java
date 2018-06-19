package com.rulla.tests;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestSubrscribleOneclick extends WebDriverSetings {

    @Test

    public void subrscribleOneclick() {
        driver.get("https://ca.rulla.com/account/login.html");
        WebElement Loginfield = driver.findElement(By.id("LoginForm_email"));
        Loginfield.sendKeys("zhogov@trud.com");
        WebElement Password = driver.findElement(By.id("LoginForm_password"));
        Password.sendKeys("awdasd");
        WebElement LoginButton = driver.findElement(By.xpath("//button[1]"));
        LoginButton.click();
        WebElement searchBtn = driver.findElement(By.xpath("//button[@class='search-btn']"));
        searchBtn.click();
        WebElement subButton1 = driver.findElement(By.xpath("//button[@class='btn btn-blue-shd rippled']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", subButton1);
        driver.get("https://ca.rulla.com/office/subscriptions.html");
        WebElement mailStatus = driver.findElement(By.xpath("//span[@class='req-title']"));
        String mail = mailStatus.getText();
        Assert.assertEquals("Jobs in Canada", mail);
        WebElement deliteSub = driver.findElement(By.xpath("//span[@class='ico ico-cross del-row']"));
        deliteSub.click();


    }
}
