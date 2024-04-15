package com.runnerdata;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\table.feature",glue = "org.stepdefinitionn",monochrome = true,publish=true,dryRun = false,stepNotifications = true)
public class TestRunnerClass {

}
