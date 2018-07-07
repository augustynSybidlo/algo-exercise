import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sorting.algorithms.SelectionSort;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    private SelectionSort ss;

    @BeforeEach
    void setup() {
        this.ss = new SelectionSort();
    }

    @Test
    void testIfSortMethodWorksCorrectly() {
        int[] array = {6, 5, 1, 8, 7, 3, 4, 2, 9, 0};
        String expected = "0123456789";
        String actual = ss.sort(array);

        assertEquals(expected, actual);
    }

    @Test
    void testIfSortMethodWorksOnArrayWithLengthLessThanTwo() {
        int[] array = {6};
        String expected = "6";
        String actual = ss.sort(array);

        assertEquals(expected, actual);
    }

    @Test
    void testIfSortMethodWorksOnEmptyArray() {
        int[] array = new int[5];
        String expected = "00000";
        String actual = ss.sort(array);

        assertEquals(expected, actual);
    }


}