package com.sel.stepDefinitions;

import com.sel.pageObjects.MonthShoesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MonthShoesDefinition {
    MonthShoesPage monthShoesPage = new MonthShoesPage();

    @Given("^click on the month \"([^\"]*)\"$")
    public void click_on_month(String month) throws Throwable {
        monthShoesPage.clickMonth(month);
    }

    @Then("^verify the month shoes count \"([^\"]*)\" \"([^\"]*)\"$")
    public void verify_the_January_month_shoe_data(String month, String count) throws Throwable {
        monthShoesPage.retrieveMonthShoesCount(month, count);
    }

    @Then("^verify all the shoe details are correct \"([^\"]*)\"$")
    public void verify_all_the_shoe_details_are_correct(String month) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        monthShoesPage.retrieveMonthShoesValues(month);
        monthShoesPage.verifyAllShoeData();
    }
}
