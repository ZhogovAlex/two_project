package com.rulla;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class FirstTest extends WebDriverSetings{


    @Test
    public void firstTest() {

        driver.get("https://rulla.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Find your dream job on Rulla.com - all jobs are in one place."));
    }
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
        String mailUser =  ProfilUser.getText();
        Assert.assertEquals("E-Mail: zhogov@trud.com", mailUser);

    }

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
        WebElement cityField   = driver.findElement(By.id("CrmCreateSubForm_region_0"));
        cityField.sendKeys("Toronto");
        WebElement vocationField = driver.findElement(By.id("CrmCreateSubForm_query_0"));
        vocationField.sendKeys("Acquisition Logistics Analyst");
        WebElement subscribeAcc = driver.findElement(By.xpath("//button[@type='submit']"));
        subscribeAcc.click();
    }

    @Test

    public void subrscrible1click() {
        driver.get("https://ca.rulla.com/account/login.html");
        WebElement Loginfield = driver.findElement(By.id("LoginForm_email"));
        Loginfield.sendKeys("zhogov@trud.com");
        WebElement Password = driver.findElement(By.id("LoginForm_password"));
        Password.sendKeys("awdasd");
        WebElement LoginButton = driver.findElement(By.xpath("//button[1]"));
        LoginButton.click();
        WebElement searchBtn = driver.findElement(By.xpath("//button[@class='search-btn']"));
        searchBtn.click();
        WebElement subscribleBtn = driver.findElement(By.xpath("//button[@class='btn btn-blue-shd rippled']"));
        subscribleBtn.click();


    }






}






