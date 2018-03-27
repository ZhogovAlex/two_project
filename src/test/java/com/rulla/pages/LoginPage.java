package com.rulla.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public WebDriver driver;

    @FindBy(id = "LoginForm_email")
    private WebElement loginField;


    @FindBy(id = "LoginForm_password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[1]")
    private WebElement loginButton;

    public void inputLogin(String login) {
        loginField.sendKeys(login);

    }

    public  void inputPassword (String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }



}
