package nick.sqtb.pft.addressbook.appmanager;

import nick.sqtb.pft.addressbook.model.CotactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(CotactData cotactData) {
        type(By.name("firstname"),cotactData.getFirstname());
        type(By.name("lastname"),cotactData.getLastname());
        type(By.name("nickname"),cotactData.getNickname());
        type(By.name("address"),cotactData.getAddress());
        type(By.name("mobile"),cotactData.getMobile());
        type(By.name("email"),cotactData.getEmail());
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void deleteContact() {
        click(By.name("selected[]"));
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        isAlertPresent();
        click(By.linkText("home"));
    }

    public void initContactModification() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void submitCoontactModification() {
        click(By.name("update"));
    }
}
