package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import sun.plugin2.util.BrowserType;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(org.openqa.selenium.remote.BrowserType.FIREFOX);

//    @BeforeMethod
    @BeforeSuite
    public void setUp() throws Exception {
        app.init();
    }

//    @AfterMethod
    @AfterSuite
    public void tearDown() {
        app.stop();
    }
}
