package HW;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1TestCircle {

//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void TestPerimeter () {
        Task1.Circle circle = new Task1.Circle(5.7);
        assertTrue(circle.Perimeter()=="35.80");
    }

    @Test
    public void TestArea () {
        Task1.Circle circle = new Task1.Circle(5.7);
        assertEquals ("102.02", circle.Area());
    }
}