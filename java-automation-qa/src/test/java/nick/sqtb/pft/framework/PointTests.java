package nick.sqtb.pft.framework;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistanceA() {

        Point p1 = new Point(5,5);
        Point p2 = new Point(5,0);

        assert p1.distance(p2) == 5;
    }

    @Test
    public void testDistanceB() {

        Point p1 = new Point(5,5);
        Point p2 = new Point(5,0);

        Assert.assertEquals(p1.distance(p2), 5.0);
    }

}
