package JavaForTesterBook.chap006domainentities.examples;

import JavaForTesterBook.domainentities.User;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;


public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    // Example of Constructor with private fields
    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();

        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }

    // Example of Constructor with public fields
    @Test
    public void userNick() {
        User nuser = new User();
        assertEquals("default nick expected", "nick", nuser.usernick);
    }

    // Explicit Constructor Invocation - constructor which takes arguments
    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin", "pA55w0rD");

        assertEquals("default username expected", "admin", user.getUsernamep());
        assertEquals("default password expected", "pA55w0rD", user.getPasswordp());
    }

    @Test
    public void canSetPassAfterConstructed() {
        User user = new User();

        user.setPassword("PaZZwor6");

        assertEquals("setter password extected", "PaZZwor6", user.getPassword());
    }

}
