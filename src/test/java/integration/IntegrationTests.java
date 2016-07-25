package integration;

import com.tovazhnianskyi.volodymyr.IShape;
import org.easymock.EasyMock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.easymock.EasyMock.anyDouble;
import static org.easymock.EasyMock.expect;

public class IntegrationTests {
    IShape shape;

    @BeforeMethod
    public void setUp() {
        shape = EasyMock.createNiceMock(IShape.class);
    }

    @Test
    public void iShapeTest() {
        expect(shape.calcSquare()).andReturn(anyDouble()).once();
    }
	//comment for triggering build
    //comment for triggering build
}
