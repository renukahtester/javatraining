package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.Baseutils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src\\test\\java\\com\\adactin\\feature\\Featurefile.feature",
		glue = "com.adactin.stepdefinition",
		monochrome = true,
		dryRun = !true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"html:ReportFile/Kohlsreport.html", "pretty",}
		)

public class Runnerfile extends Baseutils {

	@BeforeClass
	public static void Launch() {
		browserLaunch("chrome");
		maximize();
	}
}
