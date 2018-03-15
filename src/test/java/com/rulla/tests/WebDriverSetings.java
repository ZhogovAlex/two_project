package com.rulla.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSetings {

    public ChromeDriver driver;

    @Before

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/zhogova/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After

    public void close() {
    driver.quit();
    }

}

