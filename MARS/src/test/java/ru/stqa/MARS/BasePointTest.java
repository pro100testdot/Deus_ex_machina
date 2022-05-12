package ru.stqa.MARS;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.BasePoint;

public class BasePointTest {
    @Test
    public void testDistance() {
        BasePoint b = new BasePoint(2,2,3,3);
        Assert.assertEquals(b.distance(),1.4142135623730951);
    }

}
