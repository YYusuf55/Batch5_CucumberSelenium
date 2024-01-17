package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.apache.poi.hssf.record.chart.DatRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {


    @FindBy(xpath = "//h5[.='About']")
    public WebElement aboutElement;

    @FindBy(xpath = "//h5[.='Profile Details']")
    public WebElement profileDetailsElement;

    public String getProfileDetail(String profilInfo){
        String locatar ="//div[.='"+profilInfo+"']";
        BrowserUtils.waitFor(1);
        return Driver.get().findElement(By.xpath(locatar)).getText();

    }

}
