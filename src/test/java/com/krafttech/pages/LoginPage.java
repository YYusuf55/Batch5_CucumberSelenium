package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    public WebElement l_emailInputBox;

    @FindBy(id = "yourPassword")
    public WebElement l_passwordInputBox;

    @FindBy(css = "[type='submit']")
    public WebElement l_loginBtn;

   /* public void errmessage(String hatalıgiriş) {
        String errormessage = "//div[contains(text(), '"+hatalıgiriş+"')]";
    }
    */

    @FindBy(xpath = "//*[contains(text(),'Password is incorrect. Please check')]")
    public WebElement l_wrongPasswordMessage;

    @FindBy(xpath = "//*[contains(text(),'Email address is incorrect. Please check')]")
    public WebElement l_wrongEmailMessage;

    //AND Logic
    @FindBys({
            @FindBy(xpath = "//input[@name='email']"),
            @FindBy(css = "#email"),
            @FindBy(id = "email")
    })
    public WebElement emailInputBox;

    //OR Logic
    @FindAll({
            @FindBy(id = "email"),
            @FindBy(name = "another")
    })
    public WebElement emailInputBox2;



    public void login() {
        String email = ConfigurationReader.get("email");
        String password = ConfigurationReader.get("password");
        l_emailInputBox.sendKeys(email);
        l_passwordInputBox.sendKeys(password);
        l_loginBtn.click();
    }

    //method Overloading
    public void login(String email, String password) {
        l_emailInputBox.sendKeys(email);
        l_passwordInputBox.sendKeys(password);
        l_loginBtn.click();
    }

    public String getWarningMessageText(String message){
        BrowserUtils.waitFor(2);
        String locator="//*[contains(text(),'"+message+"')]";
       return Driver.get().findElement(By.xpath(locator)).getText();
    }

}
