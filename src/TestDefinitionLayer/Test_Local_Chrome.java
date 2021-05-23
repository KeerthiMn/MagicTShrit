package TestDefinitionLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*Test class to run Scenario 1 and Scenario 2 on chrome in an Windows in Local machine*/
public class Test_Local_Chrome extends CommonUtilities {
    @BeforeTest
    public void launchBrowser() {
            browser("Chrome_Local");
    }

    @Test
    public void scenarioOne() {
        magicshirtScenarioOne(); }
    @Test
    public void scenarioTwo() {
        magicshirtScenarioTwo(); }

    @AfterTest
    public void endTest() {
     terminateBrowser();
    }
}