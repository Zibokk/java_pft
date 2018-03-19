package JavaForTesterBook.chap005testwithourownclasses.domainobject.example;

import JavaForTesterBook.chap005testwithourownclasses.domainobject.TestAppEnv;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {
        assertEquals("Returns Hard Coded URL ","http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically() {
        assertEquals("Just the Domain", "192.123.0.3", TestAppEnv.DOMAIN);
        assertEquals("Just the port", "67", TestAppEnv.PORT);
    }



}
