import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

class MyMathTest {

    @ParameterizedTest(name = "max({0}, {1}) = {2}")
    @CsvSource({
        "2, 3, 3",
        "5, -3, 5",
        "0, 0, 0",
        "-10, -4, -4",
        "-7, -7, -7"
    })
    @DisplayName("max returns the larger value")
    void testMax(double a, double b, double expected) {
        assertEquals(expected, MyMath.max(a, b));
    }

    @ParameterizedTest(name = "min({0}, {1}) = {2}")
    @CsvSource({
        "2, 3, 2",
        "5, -3, -3",
        "0, 0, 0",
        "-10, -4, -10",
        "-7, -7, -7"
    })
    @DisplayName("min returns the smaller value")
    void testMin(double a, double b, double expected) {
        assertEquals(expected, MyMath.min(a, b));
    }

    @ParameterizedTest(name = "isEven({0}) = {1}")
    @CsvSource({
        "2, true",
        "0, true",
        "3, false",
        "-4, true",
        "-5, false"
    })
    @DisplayName("isEven identifies even integers")
    void testIsEven(int value, boolean expected) {
        assertEquals(expected, MyMath.isEven(value));
    }

    @ParameterizedTest(name = "isOdd({0}) = {1}")
    @CsvSource({
        "3, true",
        "2, false",
        "-5, true",
        "0, false",
        "-4, false"
    })
    @DisplayName("isOdd identifies odd integers")
    void testIsOdd(int value, boolean expected) {
        assertEquals(expected, MyMath.isOdd(value));
    }

    @Test
    @DisplayName("constants match Java Math constants")
    void testConstants() {
        assertAll(
                () -> assertEquals(Math.PI, MyMath.PI),
                () -> assertEquals(Math.E, MyMath.E)
        );
    }
}
