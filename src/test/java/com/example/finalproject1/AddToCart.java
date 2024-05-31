package com.example.finalproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends PageObject {

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    private WebElement BACKPACKATCBUTTON;

    @FindBy (id = "add-to-cart-sauce-labs-bike-light")
    private WebElement BIKELIGHTATCBUTTON;

    @FindBy (id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement BOLTTSHIRTATCBUTTON;

    @FindBy (id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement FLEECEJACKETKATCBUTTON;

    @FindBy (id = "add-to-cart-sauce-labs-onesie")
    private WebElement ONESIEATCBUTTON;

    @FindBy (id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement TSHIRTATCBUTTON;

    public AddToCart(WebDriver driver) { super(driver);}

    public void PressBACKPACKATCBUTTON() { this.BACKPACKATCBUTTON.click();}
    public void PressBIKELIGHTATCBUTTON() { this.BIKELIGHTATCBUTTON.click();}
    public void PressBOLTTSHIRTATCBUTTON() { this.BOLTTSHIRTATCBUTTON.click();}
    public void PressFLEECEJACKETKATCBUTTON() { this.FLEECEJACKETKATCBUTTON.click();}
    public void PressONESIEATCBUTTON() { this.ONESIEATCBUTTON.click();}
    public void PressTSHIRTATCBUTTON() { this.TSHIRTATCBUTTON.click();}




}
