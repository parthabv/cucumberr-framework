package org.runnner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(name = "verifying with valid details",plugin = "json:target/indexxx.json"
		,dryRun=false,glue = "org.stepdefnn",
		features="src\\test\\resources\\Features\\omr1.feature")
public class ClassRunner {
	
@AfterClass
public static void run() {
	Reporting.jvmReports("C:\\Users\\Mr.Dharan Chotu\\eclipse-workspace\\eclipse\\work out\\Cucumber\\target\\"+"indexxx.json");
}
}
