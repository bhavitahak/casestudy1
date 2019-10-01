package testBatchRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="stepDef",plugin= {"json:target/cucumber-json-report.json"})
public class TestRunner {

}