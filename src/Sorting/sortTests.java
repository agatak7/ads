package Sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class sortTests {

    @Test
    public void testSort1() {
        int[] data = {1, 2, 3, 4, 5, 6, 8};
        int[] res = {8, 6, 5, 4, 3, 2, 1};
        Sort1.foo(data.length , data);
        assertArrayEquals(data, res);
    }

    @Test
    public void quickTest() {
        int[] data = {11, 90, 33, 71, 24, 50, 35, 30, 15, 21};
        int[] data2 = {11, 15, 21, 24, 30, 33, 35, 50, 71, 90};
        QuickSort.quickSort(data);
        assertArrayEquals(data2, data);
    }

}
