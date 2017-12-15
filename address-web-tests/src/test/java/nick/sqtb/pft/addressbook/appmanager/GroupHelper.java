package nick.sqtb.pft.addressbook.appmanager;

import nick.sqtb.pft.addressbook.model.CotactData;
import nick.sqtb.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    /////////

//    public void fillContactForm(CotactData cotactData) {
//        type(By.name("firstname"),cotactData.getFirstname());
////        wd.findElement(By.name("firstname")).click();
////        wd.findElement(By.name("firstname")).clear();
////        wd.findElement(By.name("firstname")).sendKeys(cotactData.getFirstname());
//        type(By.name("lastname"),cotactData.getLastname());
//        type(By.name("nickname"),cotactData.getNickname());
//        type(By.name("address"),cotactData.getAddress());
//        type(By.name("mobile"),cotactData.getMobile());
//        type(By.name("email"),cotactData.getEmail());
//    }
//
//    public void submitContactCreation() {
//        click(By.xpath("//div[@id='content']/form/input[21]"));
//    }

}
