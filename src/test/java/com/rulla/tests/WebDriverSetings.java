package com.rulla.tests;

import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class WebDriverSetings {

    public ChromeDriver driver;
    private Select select;

    @Before

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/zhogova/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public Select getSelect(WebElement element) {
        select = new Select(element);
        return select;
    }

  //  @After

   // public void close() {
  //  driver.quit();
   // }

}

