package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.CotactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {
    
    @Test(enabled = false)
    public void testsContactCreation() {
        app.goTo().gotoHomePage();
//        app.goTo().gotoContactPage();
        List<CotactData> before = app.getContactHelper().list();

        CotactData contact = new CotactData("Test2", null, null, null, null, null);
//        fillContactForm(new CotactData("Test", "QA", "Nick", "Test Address", "55555555555555", "test@gmail.com"));
//        submitContactCreation
        app.getContactHelper().createContact(contact);

        List<CotactData> after = app.getContactHelper().list();
        Assert.assertEquals(after.size(), before.size() + 1);
        before.add(contact);
        Comparator<? super CotactData> byId = Comparator.comparingInt(CotactData::getId);
        before.sort(byId);
        after.sort(byId);

        Assert.assertEquals(before, after);
    }
}
