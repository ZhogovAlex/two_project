package com.rulla.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestcheckJobsCanada extends WebDriverSetings {
    @Test

    public void checkJobsCanadaTest() {
        driver.get("https://ca.rulla.com/");
        WebElement serchbutton = driver.findElement(By.className("search-btn"));
        serchbutton.click();
        WebElement filtrPeriod = driver.findElement(By.xpath("//span[text()='Search period']"));
        WebElement filtrSalary = driver.findElement(By.xpath("//span[text()='Salary']"));
        WebElement filtrTypeJob = driver.findElement(By.xpath("//span[text()='Type of job ']"));
        WebElement subForm = driver.findElement(By.xpath("//button[@class='btn btn-blue-shd rippled']"));
        WebElement logoRulla = driver.findElement(By.className("logo"));
        WebElement jobLinck = driver.findElement(By.xpath("//a[@href='/jobs']"));
        WebElement formRegistration = driver.findElement(By.xpath("//a[@href='/account/register_user.html']"));
        WebElement formLoginUser = driver.findElement(By.xpath("//a[@href='/account/login.html']"));
        WebElement blockLinkCat = driver.findElement(By.xpath("//div[text()=' Categories: ']"));
        WebElement blockLinkProvinc = driver.findElement(By.xpath("//div[text()=' Provinces ']"));
        WebElement blockLinkCities = driver.findElement(By.xpath("//div[text()=' Central cities ']"));
        WebElement blockLincCompany = driver.findElement(By.xpath("//div[text()=' Companies - employers: ']"));


    }

}
