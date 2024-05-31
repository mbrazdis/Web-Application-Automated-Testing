package com.example.finalproject1;

import com.codeborne.selenide.commands.Find;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject{
    private final String USERNAME1 = "standard_user";
    private final String USERNAME2 = "locked_out_user";
    private final String USERNAME3 = "problem_user";
    private final String USERNAME4 = "performance_glitch_user";
    private final String PASSWORD = "secret_sauce";

    @FindBy(id = "user-name")
    private WebElement UsernameField;

    @FindBy(id = "password")
    private WebElement PasswordField;

    @FindBy(id = "login-button")
    private WebElement LoginButton;

    public Login(WebDriver driver) {super(driver);}

    public void InsertUsername1() { this.UsernameField.sendKeys(USERNAME1);}
    public void InsertUsername2() { this.UsernameField.sendKeys(USERNAME2);}
    public void InsertUsername3() { this.UsernameField.sendKeys(USERNAME3);}
    public void InsertUsername4() { this.UsernameField.sendKeys(USERNAME4);}
    public void InsertPassword() { this.PasswordField.sendKeys(PASSWORD);}

    public void PressLoginButton() { this.LoginButton.click();}
}
