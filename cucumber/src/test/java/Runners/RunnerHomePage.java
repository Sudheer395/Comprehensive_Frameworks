package Runners;

import java.io.File;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\mindsdet355\\Downloads\\cucumber\\src\\test\\resources\\Feature",glue= {"Stepdefinition"},
monochrome=true, dryRun = false, tags="@privacy",
plugin= {"pretty","html:target/HtmlReports.html","json:target/cucumber.json"}
		)
public class RunnerHomePage{
	
}