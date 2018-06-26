import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairFinderTest {

    private PairFinder pf;

    @BeforeEach
    void setup() {
        this.pf = new PairFinder();
    }

    @Test
    void testPairFinderWhenPairPresent() {
        int[] numbers = {1, 5, 77, 9, 5, 18, 21, 1, 4};
        int value = 6;

        assertTrue(() -> pf.isPair(numbers, value));
    }

    @Test
    void testPairFinderWhenPairNotPresent() {
        int[] numbers = {1, 5, 77, 9, 5, 18, 21, 1, 4};
        int value = 100;

        assertFalse(() -> pf.isPair(numbers, value));
    }

    @Test
    void testPairFinderWhenSomeNumbersAreNegative() {
        int[] numbers = {1, 5, 77, 9, 5, -18, 21, 1, 4};
        int value = 59;

        assertTrue(() -> pf.isPair(numbers, value));
    }

    @Test
    void testIfPairFinderThrowsException() {
        int[] numbers = {1};
        int value = 66;

        assertThrows(IllegalArgumentException.class, () -> pf.isPair(numbers, value));
    }
}