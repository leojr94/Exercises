package co.swapi.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "co.swapi.www.stepdefinitions" }, features = {
		"src/test/resources/features/HU001_ApiRest.feature" }, snippets = SnippetType.CAMELCASE, monochrome = true, dryRun = false, plugin = {
				"pretty", "html:target/reports/html/", "junit:target/reports/junit/allcukes.xml",
				"json:target/reports/cukes.json" })

public class RunnerApi {

}
