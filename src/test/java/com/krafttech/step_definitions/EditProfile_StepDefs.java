package com.krafttech.step_definitions;

import com.krafttech.pages.EditProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class EditProfile_StepDefs {

    EditProfilePage editProfilePage=new EditProfilePage();

    @When("The user navigates to {string}")
    public void the_user_navigates_to(String subMenu) {
        editProfilePage.navigateToSubMenu(subMenu);
    }
    @When("The user adds {string} {string}")
    public void the_user_adds(String inputBoxName, String userInfo) {
        editProfilePage.editProfileInfo(inputBoxName, userInfo);
    }
    @When("The user adds {string} from drop down menu")
    public void the_user_adds_from_drop_down_menu(String job) {
        editProfilePage.selectJob(job);
    }
    @When("The user clicks on save changes button")
    public void the_user_clicks_on_save_changes_button() {
        editProfilePage.clickOnSaveButton();
    }

}

