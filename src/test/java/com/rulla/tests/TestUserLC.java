package com.rulla.tests;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUserLC extends  WebDriverSetings {


    @Test

    public void userCabinet() {
        driver.get("https://ca.rulla.com/account/login.html");
        WebElement Loginfield = driver.findElement(By.id("LoginForm_email"));
        Loginfield.sendKeys("zhogov@trud.com");
        WebElement Password = driver.findElement(By.id("LoginForm_password"));
        Password.sendKeys("awdasd");
        WebElement LoginButton = driver.findElement(By.xpath("//button[1]"));
        LoginButton.click();
        WebElement selectbutton = driver.findElement(By.xpath("//a[@class='active']"));
        WebElement buttonJobs = driver.findElement(By.xpath("//a[@href='/office/favorite/show/jobs/type/favorite.html']"));
        WebElement selectMenu = driver.findElement(By.xpath("//div[@class='option-item']"));
        WebElement deleteButt = driver.findElement(By.xpath("//a[@href='/office/favorite/show/jobs/clear/1.html']"));
        driver.get("https://ca.rulla.com/office/subscriptions.html");
        WebElement activSub = (WebElement) new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("subscribe-period-chooser")));
        WebElement mainTitle = driver.findElement(By.xpath("//div[@class='main-title ']"));
        Assert.assertEquals("My subscriptions to zhogov@trud.com", "My subscriptions to zhogov@trud.com");
        WebElement subButton = driver.findElement(By.xpath("//a[text()='Subscribe to more']"));
        WebElement addSubButton = driver.findElement(By.xpath("//a[text()='Add a subscription']"));
        WebElement textInfo = driver.findElement(By.xpath("//div[@class='txt-info']"));
        Assert.assertEquals("You are currently not subscribed for jobs (CVs). We advice to subscribe to 10 newsletters in order to receive the updates to your e-mail with the preferred frequency.", "You are currently not subscribed for jobs (CVs). We advice to subscribe to 10 newsletters in order to receive the updates to your e-mail with the preferred frequency.");

        //WebElement settingsBut = driver.findElement(By.xpath("//a[4]"));
        //settingsBut.click();
        /* WebElement historybutton = driver.findElement(By.xpath("//a[2]"));
        historybutton.click();
        WebElement activHistory = (WebElement) new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='active']")));*/
    }
}
