package com.rulla.tests;


import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;


public class TestRulla extends WebDriverSetings {




        @Test
        public void firstTest () {

        driver.get("https://rulla.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Find your dream job on Rulla.com - all jobs are in one place."));
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
        public void testLogin () {
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
        String mailUser = ProfilUser.getText();
        Assert.assertEquals("E-Mail: zhogov@trud.com", mailUser);
        WebElement dropDown = driver.findElement(By.xpath("//span[@class='ico ico-user']"));
        dropDown.click();
        WebElement logButton = driver.findElement(By.xpath("//a[@href='/users/logout.html']"));
        logButton.click();
        WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));

    }


        @Test
        public void subscrible () {
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
        WebElement cityField = driver.findElement(By.id("CrmCreateSubForm_region_0"));
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

        @Test

        public void subrscribleOneclick () {
        driver.get("https://ca.rulla.com/account/login.html");
        WebElement Loginfield = driver.findElement(By.id("LoginForm_email"));
        Loginfield.sendKeys("zhogov@trud.com");
        WebElement Password = driver.findElement(By.id("LoginForm_password"));
        Password.sendKeys("awdasd");
        WebElement LoginButton = driver.findElement(By.xpath("//button[1]"));
        LoginButton.click();
        WebElement searchBtn = driver.findElement(By.xpath("//button[@class='search-btn']"));
        searchBtn.click();
        WebElement subButton1 = driver.findElement(By.xpath("//button[@class='btn btn-blue-shd rippled']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", subButton1);
        driver.get("https://ca.rulla.com/office/subscriptions.html");
        WebElement mailStatus = driver.findElement(By.xpath("//span[@class='req-title']"));
        String mail = mailStatus.getText();
        Assert.assertEquals("Jobs in Canada", mail);
        WebElement deliteSub = driver.findElement(By.xpath("//span[@class='ico ico-cross del-row']"));
        deliteSub.click();


    }

        @Test
        public void findingflags () {
        driver.get("https://rulla.com/");


    }

        @Test
        public void linkbyCa () {
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

        @Test
        public void unregistSub () {
        driver.get("https://uk.rulla.com/jobs/");
        WebElement subForm = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        subForm.sendKeys("zhogov+09123@trud.com");
        WebElement subButton1 = driver.findElement(By.xpath("//button[@class='btn btn-blue-shd rippled']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", subButton1);

    }
        @Test

        public void checkCanada () {
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
    @Test
    public void registrationTest() throws  Exception {
            driver.get("https://it.rulla.com/account/register_user.html");
        DateFormat df = new SimpleDateFormat("ddMMyyyyHHmmss");
        Date today = Calendar.getInstance().getTime();
        String todayDate = df.format(today);
        String newmail = "zhogovtest+"+todayDate+"@gmail.com";
            WebElement loginButton = driver.findElement(By.id("LoginForm_email"));
            loginButton.sendKeys(newmail);
            WebElement firstPassword = driver.findElement(By.id("LoginForm_password"));
            firstPassword.sendKeys("awdasd");
            WebElement repeatPassword = driver.findElement(By.id("LoginForm_password_repeat"));
            repeatPassword.sendKeys("awdasd");
            WebElement regButton = driver.findElement(By.xpath( "//button[@class='btn btn-blue btn-md rippled']"));
           regButton.click();
           WebElement massage = driver.findElement(By.className("info-window"));


        Properties props = new Properties();

        props.put("mail.pop3.host", "pop.gmail.com");
        props.put("mail.pop3.port", "995");
        props.put("mail.pop3.user", "zhogovtest@gmail.com");
        props.put("mail.store.protocol", "pop3s");
        props.put("mail.pop3.socketFactory.class", javax.net.ssl.SSLServerSocketFactory.class);

        Session session  = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("zhogovtest@gmail.com", "050487CfIf");
                 }
             });

          }

    @Test

    public void userCabinet() {
        driver.get("https://ca.rulla.com/account/login.html");
        WebElement Loginfield = driver.findElement(By.id("LoginForm_email"));
        Loginfield.sendKeys("zhogov@trud.com");
        WebElement Password = driver.findElement(By.id("LoginForm_password"));
        Password.sendKeys("awdasd");
        WebElement LoginButton = driver.findElement(By.xpath("//button[1]"));
        LoginButton.click();
        WebElement selectbutton = driver.findElement(By.xpath("//a[@class='active']"));
        WebElement buttonJobs = driver.findElement(By.xpath("//a[@href='/office/favorite/show/jobs/type/favorite.html']"));
        WebElement selectMenu = driver.findElement(By.xpath("//div[@class='option-item']"));
        WebElement deleteButt = driver.findElement(By.xpath("//a[@href='/office/favorite/show/jobs/clear/1.html']"));
        driver.get("https://ca.rulla.com/office/subscriptions.html");
        WebElement activSub = (WebElement) new WebDriverWait(driver, 10)
        .until(ExpectedConditions.presenceOfElementLocated(By.id("subscribe-period-chooser")));
        WebElement mainTitle = driver.findElement(By.xpath("//div[@class='main-title ']"));
        Assert.assertEquals("My subscriptions to zhogov@trud.com", "My subscriptions to zhogov@trud.com");
        WebElement subButton = driver.findElement(By.xpath("//a[text()='Subscribe to more']"));
        WebElement addSubButton = driver.findElement(By.xpath("//a[text()='Add a subscription']"));
        WebElement textInfo = driver.findElement(By.xpath("//div[@class='txt-info']"));
        Assert.assertEquals("You are currently not subscribed for jobs (CVs). We advice to subscribe to 10 newsletters in order to receive the updates to your e-mail with the preferred frequency.", "You are currently not subscribed for jobs (CVs). We advice to subscribe to 10 newsletters in order to receive the updates to your e-mail with the preferred frequency.");
        
        //WebElement settingsBut = driver.findElement(By.xpath("//a[4]"));
        //settingsBut.click();
        /* WebElement historybutton = driver.findElement(By.xpath("//a[2]"));
        historybutton.click();
        WebElement activHistory = (WebElement) new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='active']")));*/






    }




        }







