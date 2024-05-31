package com.example.finalproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu extends PageObject{
    @FindBy (xpath = "//*[@id=\"react-burger-menu-btn\"]")
    private WebElement MENUBUTTON;

    @FindBy (xpath = "//*[@id=\"inventory_sidebar_link\"]")
    private WebElement ALLITEMSBUTTON;

    @FindBy (xpath = "//*[@id=\"about_sidebar_link\"]")
    private WebElement ABOUTBUTTON;

    @FindBy (xpath = "//*[@id=\"logout_sidebar_link\"]")
    private WebElement LOGOUTBUTTON;

    @FindBy (xpath = "//*[@id=\"reset_sidebar_link\"]")
    private WebElement RESETBUTTON;

    @FindBy (xpath = "//*[@id=\"shopping_cart_container\"]/a")
    private WebElement CARTBUTTON;

    public void PressMENUBUTTON() { this.MENUBUTTON.click();}
    public void PressALLITEMSBUTTON() { this.ALLITEMSBUTTON.click();}
    public void PressABOUTBUTTON() { this.ABOUTBUTTON.click();}
    public void PressLOGOUTBUTTON() { this.LOGOUTBUTTON.click();}
    public void PressRESETBUTTON() { this.RESETBUTTON.click();}
    public void PressCARTBUTTON() { this.CARTBUTTON.click();}

    public Menu(WebDriver driver) { super(driver);}


}
