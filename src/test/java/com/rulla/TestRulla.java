package com.rulla;


import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestRulla extends WebDriverSetings {




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
            WebElement subscribleText = driver.findElement(By.xpath("//span[@class='req-title']"));
            String textsub = subscribleText.getText();
            Assert.assertSame("Jobs Acquisition Logistics Analyst in Toronto", "Jobs Acquisition Logistics Analyst in Toronto");
            WebElement deleteButton = driver.findElement(By.xpath("//span[@data-gatrackname='unsubscribeAccInSubscriptionsDelete']"));
            deleteButton.click();
        }

     //   @Test

    //    public void subrscrible1click() {
    //        driver.get("https://ca.rulla.com/account/login.html");
    //        WebElement Loginfield = driver.findElement(By.id("LoginForm_email"));
    //        Loginfield.sendKeys("zhogov@trud.com");
    //        WebElement Password = driver.findElement(By.id("LoginForm_password"));
    //        Password.sendKeys("awdasd");
     //       WebElement LoginButton = driver.findElement(By.xpath("//button[1]"));
     //       LoginButton.click();
    //        WebElement searchBtn = driver.findElement(By.xpath("//button[@class='search-btn']"));
    //        searchBtn.click();
    //        WebElement subButton1 = driver.findElement(By.xpath("//button[@class='button.btn.btn-blue-shd.rippled'"));


    //    }

    @Test
    public void findingflags(){
        driver.get("https://rulla.com/");
        WebElement flagCa = driver.findElement(By.xpath("//a[@title='Canada']"));
        WebElement flagIt = driver.findElement(By.xpath("//a[@title='Italia']"));
        WebElement flagPl = driver.findElement(By.xpath("//a[@title='Polska']"));
        WebElement flagPo = driver.findElement(By.xpath("//a[@title='Portugal']"));
        WebElement flagAu = driver.findElement(By.xpath("//a[@title='Australia']"));
        WebElement flagUK = driver.findElement(By.xpath("//a[@title='UK']"));
        WebElement flagIn = driver.findElement(By.xpath("//a[@title='India']"));
        WebElement flagBr = driver.findElement(By.xpath("//a[@title='Brasil']"));
        WebElement flagDe = driver.findElement(By.xpath("//a[@title='Deutschland']"));
        WebElement flagEs = driver.findElement(By.xpath("//a[@title='España']"));
        WebElement flagFr = driver.findElement(By.xpath("//a[@title='France']"));
        WebElement flagId = driver.findElement(By.xpath("//a[@title='Indonesia']"));
        WebElement flagRo = driver.findElement(By.xpath("//a[@title='România']"));
        WebElement flagVi = driver.findElement(By.xpath("//a[@title='Việt Nam']"));
        WebElement flagAr = driver.findElement(By.xpath("//a[@title='Argentina']"));
        WebElement flagCl = driver.findElement(By.xpath("//a[@title='Chile']"));
        WebElement flagCo = driver.findElement(By.xpath("//a[@title='Colombia']"));
        WebElement flagMx = driver.findElement(By.xpath("//a[@title='México']"));
        WebElement flagPe = driver.findElement(By.xpath("//a[@title='Perú']"));
        WebElement flagVe = driver.findElement(By.xpath("//a[@title='Venezuela']"));
        WebElement flagHr = driver.findElement(By.xpath("//a[@title='Hrvatska']"));
        WebElement flagAt = driver.findElement(By.xpath("//a[@title='Österreich']"));
        WebElement flagCh = driver.findElement(By.xpath("//a[@title='Schweiz']"));

    }

    @Test
    public void linkbyCa() {
            driver.get("https://ca.rulla.com/");




    }









    }


