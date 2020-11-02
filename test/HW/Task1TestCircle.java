package HW;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class Task1TestCircle {

    private Task1.Circle circle;

    @Before
    public void setUp() {
        circle = new Task1.Circle(5.7);
    }

    @Test
    public void TestPerimeter () {
        Assert.assertEquals ("Error", circle.Perimeter(), "35.80");
    }

    @Test
    public void TestArea () {
        Assert.assertEquals ("Error", circle.Area(), "102.02");
    }
}