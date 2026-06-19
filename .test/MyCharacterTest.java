import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MyCharacterTest {

    @ParameterizedTest
    @CsvSource({
            "A, true",
            "z, true",
            "M, true",
            "1, false",
            "@, false",
            "' ', false"
    })
    void testIsLetter(char input, boolean expected) {
        assertEquals(expected, MyCharacter.isLetter(input));
    }

    @ParameterizedTest
    @CsvSource({
            "0, true",
            "5, true",
            "9, true",
            "a, false",
            "' ', false",
            "-, false"
    })
    void testIsDigit(char input, boolean expected) {
        assertEquals(expected, MyCharacter.isDigit(input));
    }

    @ParameterizedTest
    @CsvSource({
            "A, true",
            "Z, true",
            "a, false",
            "z, false",
            "1, false"
    })
    void testIsUpperCase(char input, boolean expected) {
        assertEquals(expected, MyCharacter.isUpperCase(input));
    }

    @ParameterizedTest
    @CsvSource({
            "a, true",
            "z, true",
            "A, false",
            "Z, false",
            "9, false"
    })
    void testIsLowerCase(char input, boolean expected) {
        assertEquals(expected, MyCharacter.isLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource({
            "a, A",
            "z, Z",
            "M, M",
            "1, 1",
            "@, @"
    })
    void testToUpperCase(char input, char expected) {
        assertEquals(expected, MyCharacter.toUpperCase(input));
    }

    @ParameterizedTest
    @CsvSource({
            "A, a",
            "Z, z",
            "m, m",
            "1, 1",
            "@, @"
    })
    void testToLowerCase(char input, char expected) {
        assertEquals(expected, MyCharacter.toLowerCase(input));
    }
}