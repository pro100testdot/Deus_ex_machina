package stqa;

import org.testng.annotations.Test;

public class SquareTest {
    @Test
     public void TestArea(){
        Square l = new Square(5);
        assert l.area()==4;
    }

}
