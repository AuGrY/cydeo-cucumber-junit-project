package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user searches for {word}")
    public void user_searches_for_apple(String word) {

        googleSearchPage.searchBox.sendKeys(word + Keys.ENTER);

    }

    @Then("user should see {word} in the title")
    public void user_should_see_apple_in_the_title(String word) {

        BrowserUtils.verifyTitle(word+" - Google Suche");


    }

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() throws InterruptedException {

        Driver.getDriver().get("https://www.google.com");
        googleSearchPage.acceptAllCookiesButton().click();
        Thread.sleep(2000);



    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);



    }


//    @And("user sees {int} apples")
//    public void userSeesApples(int arg0) {
//    }
}