package sg.npayment.geek;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    public void testPrimitiveArrayEquality() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual, "Arrays are not equal!");
    }

    @Test
    public void testObjectArrayEquality() {
        String[] expected = {"apple", "banana", "cherry"};
        String[] actual = {"apple", "banana", "cherry"};
        assertArrayEquals(expected, actual);
    }
}