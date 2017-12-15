package nick.sqtb.pft.addressbook.appmanager;

import nick.sqtb.pft.addressbook.model.CotactData;
import nick.sqtb.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void fillContactForm(CotactData cotactData) {
        type(By.name("firstname"),cotactData.getFirstname());
//        wd.findElement(By.name("firstname")).click();
//        wd.findElement(By.name("firstname")).clear();
//        wd.findElement(By.name("firstname")).sendKeys(cotactData.getFirstname());
        type(By.name("lastname"),cotactData.getLastname());
        type(By.name("nickname"),cotactData.getNickname());
        type(By.name("address"),cotactData.getAddress());
        type(By.name("mobile"),cotactData.getMobile());
        type(By.name("email"),cotactData.getEmail());
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

}
