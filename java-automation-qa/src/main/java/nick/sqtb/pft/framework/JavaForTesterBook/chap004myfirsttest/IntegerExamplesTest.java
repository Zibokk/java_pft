package nick.sqtb.pft.framework.JavaForTesterBook.chap004myfirsttest;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;


public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
//        Instantiate an Integer Class
//        Integer four = new Integer(4);

//        Example with autoboxing for new java
        Integer four = 4;
        assertEquals("intValue returns int 4", 4, four.intValue());
//        Assert.assertEquals(four.intValue(), 4);

//        Example with String
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
    }

    @Test
    public void integerHexString() {
        Integer eleven = 11;
        assertEquals("11 becomes b", "b", eleven.toHexString(eleven));
    }

    @Test
    public void integerMaxAndMin() {
        Integer min = Integer.MIN_VALUE;
        assertEquals("min value equals -2147483648", -2147483648, min.intValue());

        Integer max = Integer.MAX_VALUE;
        assertEquals("max value equals 2147483647", 2147483647, max.intValue());
    }

}
