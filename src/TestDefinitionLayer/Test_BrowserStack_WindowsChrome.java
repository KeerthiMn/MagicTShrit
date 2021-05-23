package TestDefinitionLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*Test class to run Scenario 1 and Scenario 2 on chrome in an Windows in browser stack*/
public class Test_BrowserStack_WindowsChrome extends CommonUtilities {

    @BeforeTest
    public void launchBrowser() {
        browser("BS_Chrome");
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