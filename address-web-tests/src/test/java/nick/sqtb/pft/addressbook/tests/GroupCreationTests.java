package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Set;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goTo().groupPage();
        Set<GroupData> before = app.group().all();
//        int before = app.group().getGroupCount();

//        GroupData group = new GroupData("test2", null, null);
        GroupData group = new GroupData().withName("test2");

        app.group().create(group);
//        app.group().initGroupCreation();
//        app.group().fillGroupForm(new GroupData("test1", null, null));
//        app.group().submitGroupCreation();
//        app.group().returnToGroupPage();

        Set<GroupData> after = app.group().all();
//        int after = app.group().getGroupCount();
        Assert.assertEquals(after.size(), before.size() + 1);

//        int max = 0;
//        for (GroupData g : after) {
//            if (g.getId() > max) {
//                max = g.getId();
//            }
//        }

        group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
        before.add(group);
//        Comparator<? super GroupData> byId = Comparator.comparingInt(GroupData::getId);
//        before.sort(byId);
//        after.sort(byId);

//        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
        Assert.assertEquals(before, after);
    }

}
