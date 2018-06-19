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

public class TestRegistrationRulla extends WebDriverSetings {

    @Test
    public void registrationTest() throws Exception {
        driver.get("https://it.rulla.com/account/register_user.html");
        DateFormat df = new SimpleDateFormat("ddMMyyyyHHmmss");
        Date today = Calendar.getInstance().getTime();
        String todayDate = df.format(today);
        String newmail = "zhogovtest+" + todayDate + "@gmail.com";
        WebElement loginButton = driver.findElement(By.id("LoginForm_email"));
        loginButton.sendKeys(newmail);
        WebElement firstPassword = driver.findElement(By.id("LoginForm_password"));
        firstPassword.sendKeys("awdasd");
        WebElement repeatPassword = driver.findElement(By.id("LoginForm_password_repeat"));
        repeatPassword.sendKeys("awdasd");
        WebElement regButton = driver.findElement(By.xpath("//button[@class='btn btn-blue btn-md rippled']"));
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
