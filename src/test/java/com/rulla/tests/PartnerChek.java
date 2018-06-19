package com.rulla.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PartnerChek extends WebDriverSetings {

    @Test
    public void checkHHua(){
        driver.get("https://ua.trud.com/account/login.html");
        WebElement loginFild = driver.findElement(By.xpath("//*[@id=\"LoginForm_email\"]"));
        loginFild.sendKeys("zhogov@trud.com");
        WebElement passwordFild = driver.findElement(By.xpath("//*[@id=\"LoginForm_password\"]"));
        passwordFild.sendKeys("asdawd");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"form-login\"]/div/div[3]/button"));
        loginButton.click();
        driver.get("https://www.trud.com/admin/sites/importlog.html?id=9");
        WebElement checkStatus = driver.findElement(By.xpath("//*[@id=\"yw0\"]/table/tbody/tr[1]/td[2]"));
        String Check = checkStatus.getText();
        Assert.assertEquals("завершено", "завершено");



    }


}
