package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", 
				"html:Cucumber_reports/cucumber_report.html",
				"json:Cucumber_reports/cucumber_report.json"},
		features="./src/test/resources/features",
		glue="tests",
		tags="@VerifyingLoginPageUI_Components"
		)
public class TestRunner {

}
