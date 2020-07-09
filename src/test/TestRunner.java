package com.assignment.testLead.EmployeeDB;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Abhay.27\\Downloads\\eclipse-java-oxygen-2-win32-x86_64\\eclipse\\Libraries\\Documents\\EmployeeDB\\src\\test\\EmployeeDB.feature",
		glue = "",
		plugin = {"pretty", "html:target/cucumber-reports" },
		monochrome = true
		)
public class TestRunner {

}
