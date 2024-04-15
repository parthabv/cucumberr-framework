package org.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE, dryRun = false, monochrome = true, name = "verifying login with valid credentails", plugin =  "json:target/index.json", glue = "org.stepdefn", features = "src\\test\\resources")

public class TestRunnerClass {

}
