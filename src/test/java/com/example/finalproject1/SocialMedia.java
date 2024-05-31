package com.example.finalproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SocialMedia extends PageObject{

    @FindBy (xpath = "//*[@id=\"page_wrapper\"]/footer/ul/li[1]")
    private WebElement TWITTERBUTTON;

    @FindBy (xpath = "//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a")
    private WebElement FACEBOOKBUTTON;

    @FindBy (xpath = "//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a")
    private WebElement LINKEDINBUTTONBUTTON;

    @FindBy (xpath = "//*[@id=\"email-or-phone\"]")
    private WebElement EMAILFIELD;

    @FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement PASSWORDFIELD;

    @FindBy (xpath = "//*[@id=\"join-form-submit\"]")
    private WebElement JOINBUTTON;

    public SocialMedia(WebDriver driver) { super(driver);}

    public void PressTWITTERBUTTON() { this.TWITTERBUTTON.click();}
    public void PressFACEBOOKBUTTON() { this.FACEBOOKBUTTON.click();}
    public void PressLINKEDINBUTTONBUTTON() { this.LINKEDINBUTTONBUTTON.click();}
    public void InsertEMAILFIELD() { this.EMAILFIELD.sendKeys("mbrazdis@gmail.com");}
    public void InsertPASSWORDFIELD() { this.PASSWORDFIELD.sendKeys("sekXa0-xabtup-qumwyv");}
    public void PressJOINBUTTON() { this.JOINBUTTON.click();}
}
