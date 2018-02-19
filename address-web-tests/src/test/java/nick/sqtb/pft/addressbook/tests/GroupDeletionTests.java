package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Set;

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
        Set<GroupData> before = app.group().all();
        GroupData deleteGroup = before.iterator().next();
//        int index = before.size() - 1;
        app.group().delete(deleteGroup);
//        int after = app.group().getGroupCount();
//        Assert.assertEquals(after, before - 1);
        Set<GroupData> after = app.group().all();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(deleteGroup);
        Assert.assertEquals(before, after);
    }

}
