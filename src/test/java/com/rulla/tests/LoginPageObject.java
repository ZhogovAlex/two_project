package com.rulla.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
    By usernameLocator = By.id("LoginForm_email");
    By passwordLocator = By.id("LoginForm_password");
    By loginButtonLocator = By.xpath("//button[@type='submit']");



    private final WebDriver driver;

    public LoginPageObject(WebDriver driver){
        this.driver = driver;



        if (!"Login".equals(driver.getTitle())){
            throw  new IllegalStateException("This is not the login page");

        }
    }

    public LoginPageObject typeUsername(String username){
        driver.findElement(passwordLocator).sendKeys("awdasd");
        return this;

    }

 //   public HomePage submitLogin(){
    //    driver.findElement(loginButtonLocator).submit();
     //   return new LoginPageObject(driver);

  //  }
  //  public LoginPageObject submitLoginEx;



}
