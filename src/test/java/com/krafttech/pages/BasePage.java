package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import com.krafttech.utilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[class*=afm],[class*=ps-2]")
    public List<WebElement> upTitles;
    /**
     * SOFT ASSERTION
     */

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardElement;

    @FindBy(xpath = "//span[.='Developers']")
    public WebElement developersElement;

    @FindBy(xpath = "//span[.='Components']")
    public WebElement componentsElement;


    public void navigateToModule(String menu) {
        String locatorPath = "//span[.='" + menu + "']";
        WebElement element = Driver.get().findElement(By.xpath(locatorPath));
        //click on webElement
        BrowserUtils.clickWithJS(element);
    }

    //method OVERLOADING
    public void navigateToModule(String menu, String subMenu) {
        String locatorPath = "//span[.='" + menu + "']";
        WebElement element = Driver.get().findElement(By.xpath(locatorPath));
        //click on webElement
        BrowserUtils.clickWithJS(element);

        String locatorPath2 = "//span[.='" + subMenu + "']";
        WebElement element2 = Driver.get().findElement(By.xpath(locatorPath2));
        //click on webElement
        BrowserUtils.clickWithJS(element2);
    }

    public String getAccountName(String accountName){
       return Driver.get().findElement(By.xpath("//span[text()='"+accountName+"']")).getText();
    }

    //method Overloading
    public String getAccountName() {
        return upTitles.get(upTitles.size()-1).getText();
    }

public List<Map<String,String>> getDataList(String sheetName){
    ExcelUtil excelUtil=new ExcelUtil("src/test/resources/KT-_DDF_test.xlsx",sheetName);
    List<Map<String, String>> dataList = excelUtil.getDataList();
    return dataList;
}


}
