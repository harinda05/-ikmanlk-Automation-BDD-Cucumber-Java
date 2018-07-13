package Steps;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="F:\\Studies\\Third Year\\Softwre QA\\cucumberTest\\src\\test\\java\\features\\execution.feature", glue={"Steps"} , format={"pretty", "html:Reports/test-report"})

public class TestRunner {

}

