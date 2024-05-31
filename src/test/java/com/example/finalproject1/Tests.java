package com.example.finalproject1;
import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Tests extends Utils{


    public static String Login(int user) {
        WebDriver driver = new SafariDriver();
        driver.get(Utils.BASE_URL);
        Login webForm = new Login(driver);
        WaitForElement(2);
        driver.manage().window().maximize();
        WaitForElement(2);
        switch (user) {
            case 1 -> webForm.InsertUsername1();
            case 2 -> webForm.InsertUsername2();
            case 3 -> webForm.InsertUsername3();
            case 4 -> webForm.InsertUsername4();
        }
        WaitForElement(2);
        webForm.InsertPassword();
        WaitForElement(2);
        webForm.PressLoginButton();
        WaitForElement(2);
        String URL = driver.getCurrentUrl();
        driver.quit();
        return URL;
    }
    public static String AddToCart(int i, int nrProduse) {
        WebDriver driver = new SafariDriver();
        driver.get(Utils.BASE_URL);
        Login webForm = new Login(driver);
        AddToCart webForm1 = new AddToCart(driver);
        WaitForElement(2);
        driver.manage().window().maximize();
        WaitForElement(2);
        switch (i) {
            case 1 -> webForm.InsertUsername1();
            case 2 -> webForm.InsertUsername2();
            case 3 -> webForm.InsertUsername3();
            case 4 -> webForm.InsertUsername4();
        }
        WaitForElement(2);
        webForm.InsertPassword();
        WaitForElement(2);
        webForm.PressLoginButton();
        String currentURL = "https://www.saucedemo.com/inventory.html";
        if (currentURL.equals(driver.getCurrentUrl())) {
            WaitForElement(2);
            switch (nrProduse) {
                case 1 -> webForm1.PressBACKPACKATCBUTTON();
                case 2 -> {
                    webForm1.PressBACKPACKATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressBIKELIGHTATCBUTTON();
                }
                case 3 -> {
                    webForm1.PressBACKPACKATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressBIKELIGHTATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressBOLTTSHIRTATCBUTTON();
                }
                case 4 -> {
                    webForm1.PressBACKPACKATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressBIKELIGHTATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressBOLTTSHIRTATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressFLEECEJACKETKATCBUTTON();
                }
                case 5 -> {
                    webForm1.PressBACKPACKATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressBIKELIGHTATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressBOLTTSHIRTATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressFLEECEJACKETKATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressONESIEATCBUTTON();
                }
                case 6 -> {
                    webForm1.PressBACKPACKATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressBIKELIGHTATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressBOLTTSHIRTATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressFLEECEJACKETKATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressONESIEATCBUTTON();
                    WaitForElement(1);
                    webForm1.PressTSHIRTATCBUTTON();
                }
            }
                String numOfItemsInCart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
                driver.quit();
                return numOfItemsInCart;
            }
        else driver.quit();
        return "F";
    }
    public static String Checkout(int user) {
        WebDriver driver = new SafariDriver();
        driver.get(Utils.BASE_URL);
        Login webForm = new Login(driver);
        AddToCart webForm1 = new AddToCart(driver);
        Checkout webForm2 = new Checkout(driver);
        WaitForElement(2);
        driver.manage().window().maximize();
        WaitForElement(2);
        switch (user) {
            case 1 -> webForm.InsertUsername1();
            case 2 -> webForm.InsertUsername2();
            case 3 -> webForm.InsertUsername3();
            case 4 -> webForm.InsertUsername4();
        }
        WaitForElement(2);
        webForm.InsertPassword();
        WaitForElement(2);
        webForm.PressLoginButton();
        WaitForElement(2);
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals(INVENTORY_URL)) {
        webForm1.PressBACKPACKATCBUTTON();
        WaitForElement(1);
        webForm1.PressBIKELIGHTATCBUTTON();
        WaitForElement(1);
        webForm1.PressBOLTTSHIRTATCBUTTON();
        WaitForElement(1);
        webForm1.PressFLEECEJACKETKATCBUTTON();
        WaitForElement(1);
        webForm1.PressONESIEATCBUTTON();
        WaitForElement(1);
        webForm1.PressTSHIRTATCBUTTON();
        WaitForElement(2);
        webForm2.PressCARTBUTTON();
        WaitForElement(2);
        webForm2.PressCHECKOUTBUTTON();
        WaitForElement(2);
        webForm2.InsertFIRSTNAMEFIELD();
        WaitForElement(2);
        webForm2.InsertLASTNAMEFIELD();
        WaitForElement(2);
        webForm2.InsertPOSTALCODEFIELD();
        WaitForElement(2);
        webForm2.PressCONTINUEBUTTON();
        String URL = driver.getCurrentUrl();
        if (URL.equals(CHECKOUT2_URL)) {
        WaitForElement(2);
        webForm2.PressFINISHBUTTON();
        WaitForElement(2);
        webForm2.PressBACKHOMEBUTTON();
        WaitForElement(2);
        }
            driver.quit();
            return URL;
        }
        else {
            driver.quit();
            return currentURL;
        }
    }
    public static String SocialMedia(int user, int S) {
        WebDriver driver = new SafariDriver();
        driver.get(Utils.BASE_URL);
        Login webForm = new Login(driver);
        SocialMedia webForm3 = new SocialMedia(driver);
        WaitForElement(1);
        driver.manage().window().maximize();
        WaitForElement(1);
        switch (user) {
            case 1 -> webForm.InsertUsername1();
            case 2 -> webForm.InsertUsername2();
            case 3 -> webForm.InsertUsername3();
            case 4 -> webForm.InsertUsername4();
        }
        WaitForElement(1);
        webForm.InsertPassword();
        WaitForElement(1);
        webForm.PressLoginButton();
        WaitForElement(2);
        String URL2 = driver.getCurrentUrl();
        if (URL2.equals(INVENTORY_URL)){
        switch (S) {
            case 1 -> webForm3.PressTWITTERBUTTON();
            case 2 -> webForm3.PressFACEBOOKBUTTON();
            case 3 -> webForm3.PressLINKEDINBUTTONBUTTON();
        }
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        WaitForElement(3);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        WaitForElement(3);
        URL2 = driver.getCurrentUrl();
        driver.quit();
        return URL2;}
        else {
            driver.quit();
            return URL2;
        }
    }
    public static void Menu(int user) {
        WebDriver driver = new SafariDriver();
        driver.get(Utils.BASE_URL);
        Login webForm = new Login(driver);
        AddToCart webForm1 = new AddToCart(driver);
        Menu webForm2 = new Menu(driver);
        WaitForElement(2);
        driver.manage().window().maximize();
        WaitForElement(2);
        switch (user) {
            case 1 -> webForm.InsertUsername1();
            case 2 -> webForm.InsertUsername2();
            case 3 -> webForm.InsertUsername3();
            case 4 -> webForm.InsertUsername4();
        }
        WaitForElement(2);
        webForm.InsertPassword();
        WaitForElement(2);
        webForm.PressLoginButton();
        WaitForElement(2);
        webForm2.PressCARTBUTTON();
        WaitForElement(2);
        webForm2.PressMENUBUTTON();
        WaitForElement(2);
        webForm2.PressALLITEMSBUTTON();
        WaitForElement(2);
        webForm2.PressMENUBUTTON();
        WaitForElement(2);
        webForm2.PressABOUTBUTTON();
        WaitForElement(2);
        driver.navigate().back();
        WaitForElement(2);
        webForm1.PressBACKPACKATCBUTTON();
        WaitForElement(1);
        webForm1.PressBIKELIGHTATCBUTTON();
        WaitForElement(1);
        webForm1.PressBOLTTSHIRTATCBUTTON();
        WaitForElement(1);
        webForm1.PressFLEECEJACKETKATCBUTTON();
        WaitForElement(1);
        webForm1.PressONESIEATCBUTTON();
        WaitForElement(1);
        webForm1.PressTSHIRTATCBUTTON();
        WaitForElement(2);
        webForm2.PressRESETBUTTON();
        WaitForElement(2);
        webForm2.PressLOGOUTBUTTON();
        WaitForElement(2);
        driver.quit();

    }

    public static int Scan() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }




}
