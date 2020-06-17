package com.WSECU.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources"
		, glue = "com.WSECU.steps"
		, dryRun = false
		, monochrome = true
		, plugin = {"pretty", "html:target/html/cucumber-default-report", "json:target/cucumber.json"}
		, tags = {"@smoke"}
		)

public class SmokeRunner {

}
