package spicejet.example.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@list",
        features = {"src/test/resources/features"},
        glue = {"spicejet/example/stepdefinations"},
        plugin = {"pretty", "html:target/cucumber-report.html"})

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {


}



// To run with maven in terminal
// mvn clean test
// to run with tags: mvn clean test -Dcucumber.filter.tags="@scenario1 and @scenario2"

