package com.krafttech.step_definitions;

import com.krafttech.pages.DashboardPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DashbıardMenu_StepDefs {
    @Then("Validate that dashboard menu has following")
    public void validate_that_dashboard_menu_has_following(List<String>list) {
         List<String> expectedList=list;
        DashboardPage dashboardPage=new DashboardPage();
        //first way for assertion
        List<String> actualList=new ArrayList<>();
        for (WebElement upTitle : dashboardPage.upTitles) {
            actualList.add(upTitle.getText());
        }

        Assert.assertEquals(expectedList,actualList);

        //second firs way assetion
        List<String> actualList2 = BrowserUtils.getElementsText(dashboardPage.upTitles);
        Assert.assertEquals(expectedList,actualList2);
    }
    @When("Navigate to {string} and {string}")
    public void navigate_to_and(String string, String string2) {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule(string,string2);
    }

}
