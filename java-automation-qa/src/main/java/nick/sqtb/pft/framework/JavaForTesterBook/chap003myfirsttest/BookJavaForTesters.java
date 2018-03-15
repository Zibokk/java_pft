package nick.sqtb.pft.framework.JavaForTesterBook.chap003myfirsttest;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class BookJavaForTesters {

    public void aMethodOnAClass() {
        System.out.println("Hello World!!!");
    }

    @Test
    public void canOutpuMethodToConsole() {
        BookJavaForTesters myClass = new BookJavaForTesters();
        myClass.aMethodOnAClass();
    }

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer);
    }
}
