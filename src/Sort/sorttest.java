package Sort;

import Sort.Sort1;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class sorttest {

    @Test
    public void testSort() {
        int[] data = {1, 2, 3, 4, 5, 6, 8};
        int[] res = {8, 6, 5, 4, 3, 2, 1};
        Sort1.foo(data.length , data);
        assertArrayEquals(data, res);
    }

}
