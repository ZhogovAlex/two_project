package com.rulla.tests;


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
    public void findingflags() {
        driver.get("https://rulla.com/");

    }


    @Test
    public void fromMainPage() {


        driver.get("https://www.trud.com/");

        System.out.println("    Go to registration page");
        System.out.println("1) Open page 'https://www.trud.com/'");

        WebElement registrationButton = driver.findElement(By.xpath("//div[@class='container']/div[@id='nav-header']/ul[@id='unit-user-NOT-logined']/li[1]/a[@class='btn-show-registration-popup']"));
        System.out.println("2) Click the button 'Регистрация'");
        registrationButton.click();


 /*       try {
            WebElement comparingStringRegistration = driver.findElement(By.xpath("//div[@class='account-registration container clearfix']/div[@class='tabs-wraper']/div[@class='tabs-menu']/a[@class='active']"));
            String cmpStrRegistration = comparingStringRegistration.getText();
            Assert.assertEquals("Регистрация пользователя", cmpStrRegistration);

            content.add("Test FromMainPage passed successfully");
            System.out.println("Result: Go to registration page successfully completed");
            System.out.println("");

        }
        catch (Exception e){
            e.printStackTrace();
            content.add("Test FromMainPage did not passed");

        }

        driver.close();
        driver.quit();*/

    }

    @Test
    public void blockHeading() {
        driver.get("https://kiev.trud.com/");

        WebElement paginationButton = driver.findElement(By.xpath("//*[@id=\"yw48\"]/li[5]/a"));
        paginationButton.click();

        WebElement vacancyTarget = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[2]/div[10]"));
        vacancyTarget.click();

        /*WebElement favoriteBlock = driver.findElement(By.xpath("//*[@id=\"prop-1304214899\"]/div[3]/div[1]/div[2]/a[4]/span"));
        String favBlock = favoriteBlock.getText();
        Assert.assertEquals("Добавить в избранное", favBlock);

        WebElement friendBlock = driver.findElement(By.xpath("//*[@id=\"prop-1304214860\"]/div[3]/div[1]/div[2]/a[1]"));
        String frBlock = friendBlock.getText();
        Assert.assertEquals("Другу", frBlock);

        WebElement noticeBlock = driver.findElement(By.xpath("//div[@class='col-mod__left']/div[@class='ad-free ad-pages']/div[@class='card'][1]/div[@id='prop-296391621']/div[@id='adapter-container-adpage']/div[@class='panel-options']/div[@id='item-add-notice']/span"));
        String notBlock = noticeBlock.getText();
        Assert.assertEquals("Заметка", notBlock);

        WebElement shareBlock = driver.findElement(By.xpath("//div[@class='col-mod__left']/div[@class='ad-free ad-pages']/div[@class='card'][1]/div[@id='prop-296391621']/div[@id='adapter-container-adpage']/div[@class='panel-options']/div[@id='item-social-share']/span"));
        String shBlock = shareBlock.getText();
        Assert.assertEquals("Поделиться", shBlock);
*/

    }


}






