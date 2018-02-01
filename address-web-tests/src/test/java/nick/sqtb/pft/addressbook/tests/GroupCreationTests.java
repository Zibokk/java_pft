package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createGroup(new GroupData("test1", null, null));
//        app.getGroupHelper().initGroupCreation();
//        app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
//        app.getGroupHelper().submitGroupCreation();
//        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before + 1);
    }


}
