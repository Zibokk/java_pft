package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.CotactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new CotactData("Test3", "QA3", "Nick3", "Test Address3", "333333333333", "test3@gmail.com"));
        app.getContactHelper().submitCoontactModification();
    }

}
