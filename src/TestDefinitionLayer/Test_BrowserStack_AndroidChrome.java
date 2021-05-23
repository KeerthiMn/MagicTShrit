package TestDefinitionLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*Test class to run Scenario 1 and Scenario 2 on chrome in an Android device in browser stack*/

public class Test_BrowserStack_AndroidChrome extends CommonUtilities {

    @BeforeTest
    public void launchBrowser() {
        browser("BS_Chrome_Android");
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