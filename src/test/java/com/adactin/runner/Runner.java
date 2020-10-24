package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.configuration.property.FileReadManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature", 
glue = "com\\adactin\\stepdefinition",
plugin = {
		"pretty", "html:Report", "com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html",
		"rerun:Report/FailedScenario.txt"
		},





		monochrome = true, dryRun = false, strict = true)

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		String browser = FileReadManager.GetInstance().CrInstance().getBrowserLaunch();
		driver = BaseClass.browserLaunch(browser);
	}

	@AfterClass
	public static void tearDown() {
		BaseClass.close();
		driver.close();

	}

}
