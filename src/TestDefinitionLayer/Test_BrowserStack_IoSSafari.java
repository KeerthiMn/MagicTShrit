package TestDefinitionLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*Test class to run Scenario 1 and Scenario 2 on Safari in IOS device in browser stack*/
public class Test_BrowserStack_IoSSafari extends CommonUtilities {

    @BeforeTest
    public void launchBrowser() {
        browser("BS_Safari_IoS");
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