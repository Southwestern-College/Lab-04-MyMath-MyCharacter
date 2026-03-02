import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    @Test
    void testMax() {
        assertEquals(3.0, MyMath.max(2, 3));
        assertEquals(5.0, MyMath.max(5, -3));
        assertEquals(0.0, MyMath.max(0, 0));
    }

    @Test
    void testMin() {
        assertEquals(2.0, MyMath.min(2, 3));
        assertEquals(-3.0, MyMath.min(5, -3));
        assertEquals(0.0, MyMath.min(0, 0));
    }

    @Test
    void testIsEven() {
        assertTrue(MyMath.isEven(2));
        assertTrue(MyMath.isEven(0));
        assertFalse(MyMath.isEven(3));
        assertTrue(MyMath.isEven(-4));
    }

    @Test
    void testIsOdd() {
        assertTrue(MyMath.isOdd(3));
        assertFalse(MyMath.isOdd(2));
        assertTrue(MyMath.isOdd(-5));
        assertFalse(MyMath.isOdd(0));
    }

    @Test
    void testConstants() {
        assertEquals(3.141592653589793, MyMath.PI);
        assertEquals(2.718281828459045, MyMath.E);
    }
}
