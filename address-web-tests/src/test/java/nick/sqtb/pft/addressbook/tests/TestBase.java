package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sun.plugin2.util.BrowserType;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(org.openqa.selenium.remote.BrowserType.FIREFOX);

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }
}
