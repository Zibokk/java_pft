package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();

        List<GroupData> before = app.getGroupHelper().getGroupList();
//        int before = app.getGroupHelper().getGroupCount();

        app.getGroupHelper().createGroup(new GroupData("test1", null, null));
//        app.getGroupHelper().initGroupCreation();
//        app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
//        app.getGroupHelper().submitGroupCreation();
//        app.getGroupHelper().returnToGroupPage();

        List<GroupData> after = app.getGroupHelper().getGroupList();
//        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
