package com.bizlia.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		// features = "src/test/resources/Features/signup.feature",

		// features = "src/test/resources/Features/Login.feature",

		//features = "src/test/resources/Features/CompanyProfileAddress.feature",
		
				features = "src/test/resources/Features/CompanyServices.feature",

		glue = { "com.bizlia.Stepdefinations" },

		plugin = { "pretty", "json:target/cucumber-reports/Cucumber4.json",
				"junit:target/cucumber-reports/Cucumber4.xml", "html:target/cucumber-reports1.html",
				"html:target/SparkReport/Spark.html" }

)

public class TestRunner {

}
