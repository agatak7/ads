package Heap;

import Heap.Solution;
import org.junit.*;

import static org.junit.Assert.*;

public class HeapTest {
    @Test
    public void testHeapifySmall() {
        int[] data = {1, 2};
        Solution.heapify(data);
        assertArrayEquals(new int[]{2, 1}, data);
    }

    @Test
    public void testHeapSortSmall() {
        int[] data = {42, 7, 12};
        int[] sorted = {7, 12, 42};
        Solution.inPlaceHeapSort(data);
        assertArrayEquals(sorted, data);
    }

    @Test
    public void heapifyTest() {
        int [] arr = {5, 7, 2, 9, 4, 6};
        int [] arrs = {2, 4, 5, 6, 7, 9};

        Solution.inPlaceHeapSort(arr);
        assertArrayEquals(arr, arrs);
    }
}


//
