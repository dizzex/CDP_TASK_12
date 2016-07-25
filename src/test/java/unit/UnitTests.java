package unit;

import com.tovazhnianskyi.volodymyr.Circle;
import com.tovazhnianskyi.volodymyr.IShape;
import com.tovazhnianskyi.volodymyr.Rectangle;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UnitTests {
    IShape rectangle;
    IShape circle;

    @BeforeMethod
    public void setUp() {
        rectangle = new Rectangle(2.0, 3.0);
        circle = new Circle(2.0);
    }

    @Test
    public void rectangleTest() {
        Assert.assertEquals(6.0, rectangle.calcSquare());
    }

    @Test
    public void circleTest() {
        Assert.assertEquals(2.0 * Math.PI * Math.pow(2.0, 2), circle.calcSquare());
    }
}
