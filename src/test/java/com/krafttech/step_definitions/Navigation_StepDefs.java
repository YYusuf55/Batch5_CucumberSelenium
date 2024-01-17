package com.krafttech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Navigation_StepDefs {
    @Given("Login as Mike")
    public void login_as_mike() {
        System.out.println("Login as Mike");
    }
    @Then("Validate that Dashboard is visible")
    public void validate_that_dashboard_is_visible() {
        System.out.println("dashboard is visible");
    }
    @When("Go to developers menu")
    public void go_to_developers_menu() {
        System.out.println("go to developers menu");
    }
    @Then("Validate that Developers is visible")
    public void validate_that_developers_is_visible() {
        System.out.println("developers text is visible");
    }


    @Given("Login as Sebastian")
    public void login_as_sebastian() {
        System.out.println("Login as Sebestian");
    }
    @When("Go to Forms-Input menu")
    public void go_to_forms_ınput_menu() {
        System.out.println("go to forms menu");
    }
    @Then("Validate that General Form Elements text is visible")
    public void validate_that_general_form_elements_text_is_visible() {
        System.out.println("validate that general form elements text is visible");
    }


    @Given("Login as Jhon")
    public void login_as_jhon() {
        System.out.println("login as Jhon");
    }
    @When("Go go My Profile menu")
    public void go_go_my_profile_menu() {
        System.out.println("go to MyProfile Menu");
    }
    @Then("Validate that user Profile text is visible")
    public void validate_that_user_profile_text_is_visible() {
        System.out.println("validate that user profile text is visible");
    }

}