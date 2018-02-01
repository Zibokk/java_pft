package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.CotactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereContact()) {
            app.getContactHelper().createContact(new CotactData("Test", "QA", "Nick", "Test Address", "55555555555555", "test@gmail.com"));
        }
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().deleteContact();
    }
}
