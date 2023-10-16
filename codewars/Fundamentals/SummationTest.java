package Fundamentals;

import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SummationTest {
    @Test
    public void test1() {
        assertEquals(1,
        Summation.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
        Summation.summation(8));
    }
    
}


