package com.krafttech.step_definitions;

import com.krafttech.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;


public class ErrorMessage {
    LoginPage loginPage = new LoginPage();

    @Then("the login should fail with an error message {string}")
    public void the_login_should_fail_with_an_error_message() {

      //  loginPage.errmessage(errorMessage);

    }
}
