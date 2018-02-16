package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTests extends TestBase {


    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPage();
        if (! app.group().isThereAGroup()) {
            app.group().create(new GroupData().withName("test1"));
        }
    }

    @Test
    public void testsGroupDeletion() {
//        app.goTo().groupPage();
//        if (! app.group().isThereAGroup()) {
//            app.group().create(new GroupData("test1", null, null));
//        }

//        int before = app.group().getGroupCount();
        List<GroupData> before = app.group().list();
        int index = before.size() - 1;
        app.group().delete(index);
//        int after = app.group().getGroupCount();
//        Assert.assertEquals(after, before - 1);
        List<GroupData> after = app.group().list();
        Assert.assertEquals(after.size(), index);

        before.remove(index);
        Assert.assertEquals(before, after);
    }

}
