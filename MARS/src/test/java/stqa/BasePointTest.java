package stqa;


import org.testng.Assert;
import org.testng.annotations.Test;

public class BasePointTest {
    @Test
    public void testDistance() {
        BasePoint b = new BasePoint(3, 3, 5, 5);
        Assert.assertEquals(b.distance(), 2.7284271247461903);
    }

}
