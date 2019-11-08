import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AreaOfTriangleTest {
    private static AreaOfTriangle testAreaOfTriangle;

    @Before
    public void before() {
        System.out.println("before ...");
        testAreaOfTriangle = new AreaOfTriangle();
    }

    @Test
    public void triangleArea() {
        double x1 = 0.0,
                x2 = 2.0,
                x3 = 2.0;
        double y1 = 0.0,
                y2 = 0.0,
                y3 = 2.0;

        double area = 2;
       double result = testAreaOfTriangle.TriangleArea( x1,  x2,  x3,  y1,  y2,  y3);
        Assert.assertEquals(area,result);

    }

}