package Steps;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src\\test\\java\\features\\execution.feature", glue={"Steps"} , format={"pretty", "html:Reports/test-report"})

public class TestRunner {

}

