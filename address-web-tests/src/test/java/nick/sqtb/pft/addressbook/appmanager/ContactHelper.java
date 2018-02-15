package nick.sqtb.pft.addressbook.appmanager;

import nick.sqtb.pft.addressbook.model.CotactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

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

//
//        if (creation) {
//            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(cotactData.getGroup());
//        } else {
//            Assert.assertFalse(isElementPresent(By.name("new_group")));
//        }
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

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void createContact(CotactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
        returnToContactPage();
    }

    public void returnToContactPage() {
        click(By.linkText("home page"));
    }

    public boolean isThereContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public List<CotactData> list() {

        List<CotactData> contacts = new ArrayList<CotactData>();
//        List<WebElement> elements = wd.findElements(By.tagName("entry"));
        List<WebElement> elements = wd.findElements(By.cssSelector("tr.center"));

        for (WebElement element : elements) {
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            CotactData contact = new CotactData(id, name, null, null, null, null, null);
            contacts.add(contact);
        }
           return contacts;
    }
}
