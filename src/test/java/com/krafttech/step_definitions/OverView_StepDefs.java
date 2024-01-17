package com.krafttech.step_definitions;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.OverViewPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class OverView_StepDefs {
    @Then("Validate that overview menu has followings")
    public void validate_that_overview_menu_has_followings(List<String> list) {
       OverViewPage overviewPage = new OverViewPage();

        List<String> expectedList = list;
        List<String> actualList = overviewPage.getMyProfileTitlesText();

        Assert.assertEquals(expectedList,actualList);
    }
}
