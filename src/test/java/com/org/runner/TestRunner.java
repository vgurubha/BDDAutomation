package com.org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {  "src/test/java/com/org/features"  },
		glue = {"com/org/stepdefinition"},		
		tags ="@rahul",
		dryRun = true
	
		)

public class TestRunner {

}
