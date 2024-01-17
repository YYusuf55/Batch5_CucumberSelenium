package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditProfilePage extends BasePage{

    @FindBy(css = "#about")
    public WebElement aboutTextBox;

    @FindBy(xpath = "(//input[@id='company'])[1]")
    public WebElement companyTextBox;

    @FindBy(css = "select#job")
    public WebElement jobDropDownMenu;

    @FindBy(css = "#website")
    public WebElement webSiteTextBox;

    @FindBy(xpath = "(//input[@id='location'])[1]")
    public WebElement locationTextBox;

    @FindBy(css = "#skills")
    public WebElement skillsTextBox;

    @FindBy(xpath = "//button[.='Save Changes']")
    public WebElement saveButton;


    public void selectJob(String visibleText) {
        Select select = new Select(jobDropDownMenu);
        select.selectByVisibleText(visibleText);
    }

    public void clickOnSaveButton(){
        BrowserUtils.clickWithJS(saveButton);
    }

    public  String getJobName(){
        Select select = new Select(jobDropDownMenu);
        return select.getFirstSelectedOption().getText();
    }
    public void navigateToSubMenu(String menu) {
        String locatorPath = "(//button[.='" + menu + "'])[1]";
        WebElement element = Driver.get().findElement(By.xpath(locatorPath));

        BrowserUtils.clickWithJS(element);
    }
    public void editProfileInfo(String inputBoxName,String userInfo){
        WebElement inputBox=Driver.get().findElement(By.name(inputBoxName));
        inputBox.clear();
        inputBox.sendKeys(userInfo);
        BrowserUtils.waitFor(1);
    }
}
