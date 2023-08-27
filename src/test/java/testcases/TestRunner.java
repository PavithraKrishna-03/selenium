package testcases;

import org.junit.runner.RunWith;


@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = "Features"
		,glue={"stepDefinition"}
		,monochrome = false
        ,stepNotifications = true
		)
public class TestRunner {

}
