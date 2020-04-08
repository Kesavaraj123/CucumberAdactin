package com.adactin.stepdefinition;

import com.adactin.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepDefinitionHooks {

	@Before
	public void beforeHook(Scenario ref) {
		System.out.println("before hook");

		System.out.println("scenario name is:" + ref.getName());

		BaseClass.screenShot("C:\\Users\\kesavaraj\\eclipse-workspace\\CucumberAdactin\\Screenshot\\before.png");

	}

	@After
	public void afterHook(Scenario ref1) {
		System.out.println("after hook");
		System.out.println(" status is:" + ref1.getStatus());
		if (ref1.isFailed()) {

			BaseClass.screenShot("C:\\Users\\kesavaraj\\eclipse-workspace\\CucumberAdactin\\Screenshot\\fail.png");

		} else {
			BaseClass.screenShot("C:\\Users\\kesavaraj\\eclipse-workspace\\CucumberAdactin\\Screenshot\\pass.png");

		}
	}

}

// its just a another way implemation or method

/*
 * @Before public void beforeHook(Scenario ref) {
 * System.out.println("before hook");
 * 
 * System.out.println("scenario name is:" + ref.getName());
 * if(ref.getName().equalsIgnoreCase(ref.getName())) { BaseClass.screenShot(
 * "C:\\Users\\kesavaraj\\eclipse-workspace\\CucumberAdactin\\Screenshot\\before.png"
 * );
 * 
 * }
 * 
 * }
 * 
 * @After public void afterHook(Scenario ref1) {
 * System.out.println("after hook"); System.out.println(" status is:" +
 * ref1.getStatus());
 * 
 * if (ref1.getStatus().equalsIgnoreCase("passed")) {
 * 
 * BaseClass.screenShot(
 * "C:\\Users\\kesavaraj\\eclipse-workspace\\CucumberAdactin\\Screenshot\\pass.png"
 * );
 * 
 * } else if(ref1.isFailed() && ref1.getStatus().equalsIgnoreCase("failed")) {
 * BaseClass.screenShot(
 * "C:\\Users\\kesavaraj\\eclipse-workspace\\CucumberAdactin\\Screenshot\\fail.png"
 * );
 * 
 * }}
 */