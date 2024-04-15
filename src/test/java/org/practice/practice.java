package org.practice;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,glue = "org.stepdefnn",
		features={"src\\test\\resources\\Features\\omr.feature","src\\\\test\\\\resources\\\\Features\\\\omr1.feature"})

public class practice {
	
}
