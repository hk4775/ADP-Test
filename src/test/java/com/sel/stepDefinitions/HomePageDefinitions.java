package com.sel.stepDefinitions;

import com.sel.pageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageDefinitions {
    HomePage homePage = new HomePage();
    @Given("^Shoe Store URL is launched$")
    public void shoe_Store_URL_is_launched() throws Throwable {
    }

    @Then("^verify Shoe store is loaded correctly$")
    public void verify_Shoe_store_is_loaded_correctly() throws Throwable {
    }

    @Then("^verify all the months$")
    public void verify_all_the_months() throws Throwable {
        homePage.verifyAllMonths();
    }
    ;
    @Then(("close the browser"))
    public void closeBrowser(){
        homePage.closeBrowser();
    }


}
