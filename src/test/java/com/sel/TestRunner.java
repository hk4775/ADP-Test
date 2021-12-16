package com.sel;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@ExtendedCucumberOptions(

        jsonReport = "target/cucumber-report/Smoke/cucumber.json", jsonUsageReport = "target/cucumber-report/Smoke/cucumber-usage.json", outputFolder = "target/cucumber-report/Smoke", detailedReport = true, detailedAggregatedReport = true, overviewReport = true, usageReport = true,toPDF=true)

/**
 * Please notice that com.CucumberCraft.stepDefinations.CukeHooks class is in
 * the same package as the steps definitions. It has two methods that are
 * executed before or after scenario. I'm using it to delete cookies and take a
 * screenshot if scenario fails.
 */

@CucumberOptions(


        features = "src/test/resources/features", glue = { "com.sel.stepDefinitions" },
        tags= {"@smoke"}, dryRun = false,
        monochrome = true,  plugin = { "pretty", "pretty:target/cucumber-report/Smoke/pretty.txt",
        "html:target/cucumber-report/Smoke", "json:target/cucumber-report/Smoke/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests{



}
