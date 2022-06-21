package staqa2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasePoint2 {
    @Test
    public void testDistance() {
        stqa2.BasePoint2 p1 = new stqa2.BasePoint2(3, 3);
        stqa2.BasePoint2 p2 = new stqa2.BasePoint2(5, 5);
        Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
    }

}

