package com.example.finalproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends PageObject{
    @FindBy (xpath = "//*[@id=\"shopping_cart_container\"]/a")
    private WebElement CARTBUTTON;

    @FindBy (xpath = "//*[@id=\"checkout\"]")
    private WebElement CHECKOUTBUTTON;

    @FindBy (xpath = "//*[@id=\"first-name\"]")
    private WebElement FIRSTNAMEFIELD;

    @FindBy (xpath = "//*[@id=\"last-name\"]")
    private WebElement LASTNAMEFIELD;

    @FindBy (xpath = "//*[@id=\"postal-code\"]")
    private WebElement POSTALCODEFIELD;

    @FindBy (xpath = "//*[@id=\"continue\"]")
    private WebElement CONTINUEBUTTON;

    @FindBy (xpath = "//*[@id=\"finish\"]")
    private WebElement FINISHBUTTON;

    @FindBy (xpath = "//*[@id=\"back-to-products\"]")
    private WebElement BACKHOMEBUTTON;

    public Checkout(WebDriver driver) { super(driver);}

    public void PressCARTBUTTON() { this.CARTBUTTON.click();}
    public void PressCHECKOUTBUTTON() { this.CHECKOUTBUTTON.click();}
    public void InsertFIRSTNAMEFIELD() { this.FIRSTNAMEFIELD.sendKeys("Mihail");}
    public void InsertLASTNAMEFIELD() { this.LASTNAMEFIELD.sendKeys("Brazdis");}
    public void InsertPOSTALCODEFIELD() { this.POSTALCODEFIELD.sendKeys("400001");}
    public void PressCONTINUEBUTTON() { this.CONTINUEBUTTON.click();}
    public void PressFINISHBUTTON() { this.FINISHBUTTON.click();}
    public void PressBACKHOMEBUTTON() { this.BACKHOMEBUTTON.click();}



}
