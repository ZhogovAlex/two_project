package com.rulla.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class TestRegTrudBy extends WebDriverSetings {
    @Test
    public void registrationTest() throws Exception {
        driver.get("https://by.trud.com/");
        WebElement buttonReg = driver.findElement(By.xpath("//a[@class='btn-show-registration-popup']"));
        buttonReg.click();
        DateFormat df = new SimpleDateFormat("ddMMyyyyHHmmss");
        Date today = Calendar.getInstance().getTime();
        String todayDate = df.format(today);
        String newmail = "zhogovtest+" + todayDate + "@gmail.com";
        WebElement loginButton = driver.findElement(By.id("user-email-field"));
        loginButton.sendKeys(newmail);
        WebElement firstPassword = driver.findElement(By.id("user-password-field"));
        firstPassword.sendKeys("awdasd");
        WebElement repeatPassword = driver.findElement(By.id("user-password-repeat-field"));
        repeatPassword.sendKeys("awdasd");
        WebElement regButton = driver.findElement(By.xpath("//input[@class='btn btn-default btn-md']"));
        regButton.click();
        WebElement massage = driver.findElement(By.className("info-window"));


        Properties props = new Properties();

        props.put("mail.pop3.host", "pop.gmail.com");
        props.put("mail.pop3.port", "995");
        props.put("mail.pop3.user", "zhogovtest@gmail.com");
        props.put("mail.store.protocol", "pop3s");
        props.put("mail.pop3.socketFactory.class", javax.net.ssl.SSLServerSocketFactory.class);

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("zhogovtest@gmail.com", "050487CfIf");
                    }
                });

    }

}
