package com.adactin.runner;

import org.junit.runner.RunWith;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.configuration.property.FileReadManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Report/FailedScenario.txt", 
                 glue = "com\\adactin\\stepdefition",
                 plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:Report/rerunReport.html" }, 
                 monochrome = true, 
                 dryRun = false, strict = true)

public class ReRunner {
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



