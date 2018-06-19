package com.rulla.tests;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestLogin extends WebDriverSetings {

    @Test
    public void testLogin() {
        driver.get("https://ca.rulla.com/account/login.html");
        WebElement Loginfield = driver.findElement(By.id("LoginForm_email"));
        Loginfield.sendKeys("zhogov@trud.com");
        WebElement Password = driver.findElement(By.id("LoginForm_password"));
        Password.sendKeys("awdasd");
        WebElement LoginButton = driver.findElement(By.xpath("//button[1]"));
        LoginButton.click();
        WebElement ButtonSettings = driver.findElement(By.xpath("//a[4]"));
        ButtonSettings.click();
        WebElement ProfilUser = driver.findElement(By.xpath("//p"));
        String mailUser = ProfilUser.getText();
        Assert.assertEquals("E-Mail: zhogov@trud.com", mailUser);
        WebElement dropDown = driver.findElement(By.xpath("//span[@class='ico ico-user']"));
        dropDown.click();
        WebElement logButton = driver.findElement(By.xpath("//a[@href='/users/logout.html']"));
        logButton.click();
        WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));

    }
}
