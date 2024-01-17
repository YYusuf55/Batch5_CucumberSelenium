package com.krafttech.pages;

import com.krafttech.pages.BasePage;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OverViewPage extends BasePage {
    @FindBy(xpath = "//div[contains(text(),'Profile Updated')]")
    public WebElement profileUpdated;
    @FindBy(xpath = "//li/button")
    public List<WebElement> myProfileTitles;

    public void navigateToMenu(String menu) {
        String locatorPath = "(//button[.='" + menu + "'])[1]";
        WebElement element = Driver.get().findElement(By.xpath(locatorPath));

        BrowserUtils.clickWithJS(element);
    }

    public List<String> getMyProfileTitlesText() {
        return BrowserUtils.getElementsText(myProfileTitles);

    }
}
