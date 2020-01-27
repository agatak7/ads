package Final;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.*;
import static junit.framework.TestCase.assertEquals;

public class RadixTest {
    @Test(timeout = 100)
    public void testEmpty() {
        assertEquals(new ArrayList<>(), RadixSort.radixSortMSD(new ArrayList<>()));
    }

    @Test(timeout = 100)
    public void testReversed() {
        List<String> data = asList("donut", "cherry", "banana", "apple");
        List<String> data2 = asList("apple", "banana", "cherry", "donut");
        assertEquals(data2, RadixSort.radixSortMSD(data));
    }
}
