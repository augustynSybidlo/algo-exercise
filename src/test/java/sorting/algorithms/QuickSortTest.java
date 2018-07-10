package sorting.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    private QuickSort quickSort;

    @BeforeEach
    void setup() {
        this.quickSort = new QuickSort();
    }

    @Test
    void testQuickSortIfOnlyPositiveNums() {
        int[] arr = {5,6,1,2,8,9,0,3,4,5,1,1};
        int low = 0;
        int high = arr.length - 1;
        quickSort.sort(arr,low, high);
        String actual = quickSort.toString(arr);
        String expected = "011123455689";
        assertEquals(expected, actual);
    }

}