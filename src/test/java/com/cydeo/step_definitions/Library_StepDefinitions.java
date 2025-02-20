package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {

    @Given("user is on the login page of the library application")
    public void user_is_on_the_login_page_of_the_library_application() {
        System.out.println("User is on the login page of the library application.");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username.");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password.");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard.");
    }


    @And("users enters student password")
    public void usersEntersStudentPassword() {
        System.out.println("User enters student password.");

    }

    @When("users enters student username")
    public void usersEntersStudentUsername() {
        System.out.println("User enters student username.");
    }

    @When("users enters admin username")
    public void usersEntersAdminUsername() {
        System.out.println("User enters admin username.");
    }

    @And("users enters admin password")
    public void usersEntersAdminPassword() {
        System.out.println("User enters admin password.");
    }
}
