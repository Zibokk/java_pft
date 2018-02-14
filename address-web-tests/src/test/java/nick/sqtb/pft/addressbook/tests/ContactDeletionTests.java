package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.CotactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test(enabled = false)
    public void testContactDeletion() {
        app.goTo().gotoHomePage();
        if (! app.getContactHelper().isThereContact()) {
            app.getContactHelper().createContact(new CotactData("Test", "QA", "Nick", "Test Address", "55555555555555", "test@gmail.com"));
        }
        app.goTo().gotoHomePage();
        app.getContactHelper().deleteContact();
    }
}
