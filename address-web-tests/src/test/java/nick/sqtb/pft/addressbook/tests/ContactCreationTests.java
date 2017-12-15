package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.CotactData;
import org.testng.annotations.Test;

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
