package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.CotactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test(enabled = false)
    public void testContactModification() {
        app.getNavigationHelper().gotoHomePage();

        if (! app.getContactHelper().isThereContact()) {
            app.getContactHelper().createContact(new CotactData("Test", "QA", "Nick", "Test Address", "55555555555555", "test@gmail.com"));
        }

        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new CotactData("Test3", "QA3", "Nick3", "Test Address3", "333333333333", "test3@gmail.com"));
        app.getContactHelper().submitCoontactModification();
    }

}
