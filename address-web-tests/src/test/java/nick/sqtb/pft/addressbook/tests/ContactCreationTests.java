package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.CotactData;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void testsContactCreation() {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().fillContactForm(new CotactData("Test", "QA", "Nick", "Test Address", "55555555555555", "test@gmail.com"));
        app.getContactHelper().submitContactCreation();
//        fillContactForm(new CotactData("Test", "QA", "Nick", "Test Address", "55555555555555", "test@gmail.com"));
//        submitContactCreation();
    }

}
