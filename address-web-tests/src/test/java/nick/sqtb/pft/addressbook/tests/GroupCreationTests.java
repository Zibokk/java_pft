package nick.sqtb.pft.addressbook.tests;

import nick.sqtb.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goTo().groupPage();
        List<GroupData> before = app.group().list();
//        int before = app.group().getGroupCount();

//        GroupData group = new GroupData("test2", null, null);
        GroupData group = new GroupData().withName("test2");

        app.group().create(group);
//        app.group().initGroupCreation();
//        app.group().fillGroupForm(new GroupData("test1", null, null));
//        app.group().submitGroupCreation();
//        app.group().returnToGroupPage();

        List<GroupData> after = app.group().list();
//        int after = app.group().getGroupCount();
        Assert.assertEquals(after.size(), before.size() + 1);

//        int max = 0;
//        for (GroupData g : after) {
//            if (g.getId() > max) {
//                max = g.getId();
//            }
//        }

//        Comparator<? super GroupData> byId = (Comparator<GroupData>) (o1, o2) -> Integer.compare(o1.getId(), o2.getId());
//        int max1 = after.stream().max(Comparator.comparingInt(GroupData::getId)).get().getId();

//        group.setId(after.stream().max(Comparator.comparingInt(GroupData::getId)).get().getId() );
        before.add(group);
        Comparator<? super GroupData> byId = Comparator.comparingInt(GroupData::getId);
        before.sort(byId);
        after.sort(byId);

//        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
        Assert.assertEquals(before, after);
    }

}
