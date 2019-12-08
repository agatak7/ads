package HeapPos;

import static org.junit.Assert.*;

import org.junit.*;

public class posTest {
     @Test(timeout = 100)
     public void testNull() {
       assertNull(Solution.findLastPosition(null));
     }

    @Test(timeout = 100)
    public void testTwoPositions() {
        Heap heap = new Heap(42);
        heap.setLeft(heap.getRoot(), 84);
        assertEquals(84, Solution.findLastPosition(heap).getKey());
    }

     @Test(timeout = 100)
     public void testThreePositions() {
       Heap heap = new Heap(42);
       heap.setLeft(heap.getRoot(), 84);
       heap.setRight(heap.getRoot(), 99);
       assertEquals(99, Solution.findLastPosition(heap).getKey());
     }
}
