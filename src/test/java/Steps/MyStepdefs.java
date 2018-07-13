package Steps;

        import cucumber.api.PendingException;
        import org.openqa.selenium.WebDriver;

        import cucumber.api.java.en.*;
        import mainPackage.MainClass;
        import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs extends MainClass {

    WebDriver driver = null;

        @Given("^I open chrome and go to ikmanlk$")
        public void iOpenChromeAndGoToIkmanlk() throws Throwable {
            System.setProperty("webdriver.chrome.driver", "E:/iCS_codelab/installations/idealC/IntelliJ IDEA Community Edition 2017.2.3/plugins/chromedriver/chromedriver.exe");
            driver = new ChromeDriver();
            openikman(driver);
        }

        @When("^I click on property button$")
        public void iClickOnPropertyButton() throws Throwable {
            clickOnProperty(driver);
        }

        @And("^I click on houses$")
        public void iClickOnHouses() throws Throwable {
            clickOnHouses(driver);
        }

        @And("^I click on Colombo$")
        public void iClickOnColombo() throws Throwable {
            clickOnColombo(driver);
        }

        @And("^I set min,max prices and the bed count$")
        public void iSetMinMaxPriCesAndTheBedCount() throws Throwable {
            setfilters(driver,"5000000", "7500000", 3);

        }

        @Then("^i should be ale to get verified advertisement details$")
        public void iShouldBeAleToGetVerifiedAdvertisementDetails() throws Throwable {
            getdetails(driver, "5000000", "7500000", 3 );

        }


}


