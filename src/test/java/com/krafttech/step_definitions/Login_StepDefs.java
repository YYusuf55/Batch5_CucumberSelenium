package com.krafttech.step_definitions;

import com.krafttech.pages.BasePage;
import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import com.krafttech.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    //    ExcelUtil excelUtil=new ExcelUtil("src/test/resources/KT-_DDF_test.xlsx","QA 1");
//    List<Map<String, String>> dataList = excelUtil.getDataList();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("The user is on the login page")
    public void the_useris_on_the_login_page() {


        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {

        LoginPage loginPage = new LoginPage();
        String teacherEmail = ConfigurationReader.get("teacherEmail");
        String teacherPassword = ConfigurationReader.get("teacherPassword");
        loginPage.login(teacherEmail, teacherPassword);
    }

    @Then("The user should be able to log in")
    public void the_user_should_be_able_to_log_in() {
        String expected = "https://www.krafttechexlab.com/index";
        String actual = Driver.get().getCurrentUrl();
        Assert.assertEquals(expected, actual);
    }

    @When("The user enters student credentials")
    public void the_user_enters_student_credentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("studentEmail"), ConfigurationReader.get("studentPassword"));
    }

    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("developerEmail"), ConfigurationReader.get("developerPassword"));
    }

    @When("The user enters SDET credentials")
    public void the_user_enters_sdet_credentials() {
        System.out.println("I enter SDET useremail and password and click login button");

    }

    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String email, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(email, password);
    }

    @Then("Validate that {string} is visible at top right")
    public void validate_that_is_visible_at_top_right(String string) {
        DashboardPage dashboardPage = new DashboardPage();
        String expected = string;
        String actual = dashboardPage.getAccountName();
        Assert.assertEquals(expected, actual);
    }

    @When("The user logs in using following menu")
    public void the_user_logs_in_using_following_menu(Map<String, String> map) {
        LoginPage loginPage = new LoginPage();
        String email = map.get("username");
        String password = map.get("password");
        loginPage.login(email, password);
    }

    @Then("The warning message contains {string}")
    public void the_warning_message_contains(String expectedmessage) {

        String actualWaringMessage = loginPage.getWarningMessageText(expectedmessage);
        Assert.assertEquals(expectedmessage, actualWaringMessage);
    }

    @When("The user enters {string} and row number {int}")
    public void the_user_enters_and_row_number(String sheetName, int rowNumber) {
        // ExcelUtil excelUtil=new ExcelUtil("src/test/resources/KT-_DDF_test.xlsx",sheetName);
        //  List<Map<String, String>> dataList = excelUtil.getDataList();
        // loginPage.login(dataList.get(0).get("username"),dataList.get(0).get("password"));
        // loginPage.login(dataList.get(rowNumber).get("username"),dataList.get(rowNumber).get("password"));
        loginPage.login(loginPage.getDataList(sheetName).get(rowNumber).
                get("username"), loginPage.getDataList(sheetName).get(rowNumber).get("password"));
    }

    @Then("The user verifies that profil name welcome message contains in excel {string} {int}")
    public void the_user_verifies_that_profil_name_welcome_message_contains_in_excel(String sheetName,int rowNumber) {

        String actualName = dashboardPage.getAccountName();
        Assert.assertTrue(actualName.contains(loginPage.getDataList(sheetName).get(rowNumber).get("name")));
    }

    @Then("The user verifies that {string} info in excel {string} {int}")
    public void the_user_verifies_that_job_name_in_excel(String infoTitle, String sheetName, int rowNumber) {
        //  String actualJob = dashboardPage.getProfilDetail(dataList.get(rowNumberForJob).get("job"));
        //  Assert.assertEquals(dataList.get(rowNumberForJob).get("job"),actualJob);
        String actualProfileInfo=dashboardPage.getProfileDetail(dashboardPage.getDataList(sheetName)
                .get(rowNumber).get(infoTitle));
        System.out.println("actualProfileInfo = " + actualProfileInfo);
        Assert.assertEquals(dashboardPage.getDataList(sheetName)
                .get(rowNumber).get(infoTitle),actualProfileInfo);
    }

}
