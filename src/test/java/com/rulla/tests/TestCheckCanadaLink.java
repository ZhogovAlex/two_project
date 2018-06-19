package com.rulla.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCheckCanadaLink extends WebDriverSetings {
    @Test

    public void checkCanada() {
        driver.get("https://ca.rulla.com/");
        WebElement serchFind = driver.findElement(By.id("search-vacation-field"));
        serchFind.click();
        WebElement serchFindRegion = driver.findElement(By.id("search-region-field"));
        serchFindRegion.click();
        WebElement linkBrowseJob = driver.findElement(By.xpath("//a[@title='Browse Jobs by region, industry, job title or company']"));
        WebElement linkOtherCountry = driver.findElement(By.xpath("//a[@href='https://rulla.com']"));
        WebElement findWidget = driver.findElement(By.xpath("//a[@href='/widget/index/view/publishers.html']"));
        WebElement findLinkPartners = driver.findElement(By.xpath("//a[@href='/partners.html']"));
        WebElement findLinkCompany = driver.findElement(By.xpath("//a[@href='/companies/']"));
        WebElement linkTermsUse = driver.findElement(By.xpath("//a[@href='/info/terms.html']"));
        WebElement linkPrivatPolicy = driver.findElement(By.xpath("//a[@href='/info/privacy.html']"));
        WebElement recentSerch = driver.findElement(By.xpath("//div[@class='title-i']"));
        WebElement buttonSerch = driver.findElement(By.className("search-btn"));
        buttonSerch.click();


    }
}
