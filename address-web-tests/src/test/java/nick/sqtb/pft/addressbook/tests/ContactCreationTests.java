package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.CotactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    
    @Test(enabled = false)
    public void testsContactCreation() {
        app.getNavigationHelper().gotoHomePage();
//        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().createContact(new CotactData("Test", "QA", "Nick", "Test Address", "55555555555555", "test@gmail.com"));
//        fillContactForm(new CotactData("Test", "QA", "Nick", "Test Address", "55555555555555", "test@gmail.com"));
//        submitContactCreation
    }
}
