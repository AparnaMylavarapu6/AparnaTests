package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features ="Features",
		glue={"com.StepDefinitions"},
		monochrome =true,
		plugin ={"html:reports.html","json:reports.json"},
		tags={"@homepage"}
		
		)

public class RunnerClass {

}
