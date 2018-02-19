package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.GroupData;
import nick.sqtb.pft.addressbook.model.Groups;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

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
        Groups before = app.group().all();
        GroupData deleteGroup = before.iterator().next();
//        int index = before.size() - 1;
        app.group().delete(deleteGroup);
//        int after = app.group().getGroupCount();
//        Assert.assertEquals(after, before - 1);
        Groups after = app.group().all();
        assertEquals(after.size(), before.size() - 1);
//        before.remove(deleteGroup);
//        Assert.assertEquals(before, after);
        assertThat(after, equalTo(before.without(deleteGroup)));
    }

}
