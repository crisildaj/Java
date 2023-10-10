package Fundamentals;

import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GradeBookTest {
    @Test
    public void test1() {
        assertEquals('A', GradeBook.getGrade(95,90,93));
        assertEquals('A', GradeBook.getGrade(100,85,96));
        assertEquals('A', GradeBook.getGrade(92,93,94));
        assertEquals('A', GradeBook.getGrade(100,100,100));
    }
    @Test
    public void test2() {
        assertEquals('B', GradeBook.getGrade(70,70,100));
        assertEquals('B', GradeBook.getGrade(82,85,87));
        assertEquals('B', GradeBook.getGrade(84,79,85));
    }
    @Test
    public void test3() {
        assertEquals('C', GradeBook.getGrade(70,70,70));
        assertEquals('C', GradeBook.getGrade(75,70,79));
        assertEquals('C', GradeBook.getGrade(60,82,76));
    }
    @Test
    public void test4() {
        assertEquals('D', GradeBook.getGrade(65,70,59));
        assertEquals('D', GradeBook.getGrade(66,62,68));
        assertEquals('D', GradeBook.getGrade(58,62,70));
    }
    @Test
    public void test5() {
        assertEquals('F', GradeBook.getGrade(44,55,52));
        assertEquals('F', GradeBook.getGrade(48,55,52));
        assertEquals('F', GradeBook.getGrade(58,59,60));
        assertEquals('F', GradeBook.getGrade(0,0,0));
    }
}
