import algorithms.FindProductOfIntegers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindProductOfIntegersTest {

    private FindProductOfIntegers fp;

    @BeforeEach
    void setup() {
        this.fp = new FindProductOfIntegers();
    }

    @Test
    void testFindMaxProductOfTwoIntegersWhenAllPositive() {
        int[] arr = {11, 5, 9, 85, 44, 8, 15};
        int expected = 3740;
        int actual = fp.findMaxProductOfTwoIntegers(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testFindMaxProductOfTwoIntegersWhenAllNegative() {
        int[] arr = {-11, -5, -9, -85, -44, -8, -15};
        int expected = 40;
        int actual = fp.findMaxProductOfTwoIntegers(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testFindMaxProductOfTwoIntegers() {
        int[] arr = {-11, 5, -9, 85, -44, 8, -15};
        int expected = 680;
        int actual = fp.findMaxProductOfTwoIntegers(arr);
        assertEquals(expected, actual);
    }

}