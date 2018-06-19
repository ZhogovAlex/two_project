package com.rulla.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestlinkByCanada extends WebDriverSetings {

    @Test
    public void linkByCanada() {
        driver.get("https://rulla.com/");
        WebElement flagCa = driver.findElement(By.xpath("//a[@title='Canada']"));
        flagCa.click();
        WebElement categoriLink = driver.findElement(By.xpath("//div[text()=' Job search by Categories ']"));
        WebElement cityLink = driver.findElement(By.xpath("//div[text()=' Jobs by Cities ']"));
        WebElement companyLink = driver.findElement(By.xpath("//div[text()=' Jobs by Companies ']"));
        WebElement listingCat = driver.findElement(By.xpath("//span[@class='next nxt-regions']"));
        listingCat.click();
        WebElement klickCategori = driver.findElement(By.linkText("Sales"));
        klickCategori.click();

    }
}
