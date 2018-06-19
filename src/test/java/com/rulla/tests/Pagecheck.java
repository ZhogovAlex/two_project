package com.rulla.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pagecheck extends WebDriverSetings {

    @Test
    public void testUATrud() {
        driver.get("https://www.trud.com/");
        WebElement serchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-search']"));
        serchButton.click();
        WebElement titleSerch = driver.findElement(By.xpath("/html/head/title"));
        String Title = titleSerch.getText();
        Assert.assertEquals("Работа в Киеве. Вакансии в Киеве. Поиск работы в Киеве на TRUD.COM", "Работа в Киеве. Вакансии в Киеве. Поиск работы в Киеве на TRUD.COM");

    }

    @Test
    public void testKGTrud() {
    driver.get("https://kg.trud.com/");
    WebElement serchButton  = driver.findElement(By.xpath("//button[@class='btn btn-default btn-search']"));
    serchButton.click();
    WebElement titleSerch = driver.findElement(By.xpath("/html/head/title"));
    String Title = titleSerch.getText();
    Assert.assertEquals("Работа в Киргизии, вакансии в Киргизии, поиск работы в Киргизии на Kg.trud.com", "Работа в Киргизии, вакансии в Киргизии, поиск работы в Киргизии на Kg.trud.com");
    WebElement flagkg = driver.findElement(By.xpath("//label[@class='i-flag flag-tiny i-flag-kg']"));
    flagkg.click();
    WebElement linkKz = driver.findElement(By.xpath("//i[@class='i-flag i-flag-kz']"));
    linkKz.click();
    WebElement serchButtonkz = driver.findElement(By.xpath("//button[@class='btn btn-default btn-search']"));
    serchButtonkz.click();
    WebElement tittleSerchKz = driver.findElement(By.xpath("/html/head/title"));
    String Titlekz = tittleSerchKz.getText();
    Assert.assertEquals("Работа в Казахстане. Поиск вакансий и резюме. Найти работу на Kz.trud.com", "Работа в Казахстане. Поиск вакансий и резюме. Найти работу на Kz.trud.com");
    WebElement dropMenu = driver.findElement(By.xpath("//label[@class='i-flag flag-tiny i-flag-kz']"));
    dropMenu.click();
    WebElement buttomMoldova = driver.findElement(By.xpath("//i[@class='i-flag i-flag-md']"));
    buttomMoldova.click();
    WebElement serchButtomMl = driver.findElement(By.xpath("//button[@class='btn btn-default btn-search']"));
    serchButtomMl.click();
    WebElement titleMl = driver.findElement(By.xpath("/html/head/title"));
    String Titleml = titleMl.getText();
    Assert.assertEquals("Работа в Молдавии. Вакансии в Молдавии | Md.trud.com", "Работа в Молдавии. Вакансии в Молдавии | Md.trud.com");
    WebElement dropmenu1 = driver.findElement(By.xpath("//label[@class='i-flag flag-tiny i-flag-md']"));
    dropmenu1.click();
    WebElement buttonTg = driver.findElement(By.xpath("//i[@class='i-flag i-flag-tj']"));
    buttonTg.click();
    WebElement serchTg = driver.findElement(By.xpath("//button[@class='btn btn-default btn-search']"));
    serchTg.click();
    WebElement titleTg = driver.findElement(By.xpath("/html/head/title"));
    String Titletg = titleTg.getText();
    Assert.assertEquals("Работа в Таджикистане, вакансии в Таджикистане на Tj.trud.com", "Работа в Таджикистане, вакансии в Таджикистане на Tj.trud.com");
    WebElement buttonаflagTg = driver.findElement(By.xpath("//span[@class='search-flags switch-flags']"));
    buttonаflagTg.click();

    }


}
