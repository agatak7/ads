package Final;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class HashTableTest {
    @Test
    public void testOneElement() {
        HashTable tab = new HashTable(1);
        assertTrue(tab.put("apple", "juice"));
        assertEquals("juice", tab.get("apple"));
        assertEquals(true, tab.remove("apple"));
        assertEquals(null, tab.get("apple"));
    }

    @Test
    public void testIllegalArgument() {
        try {
            new HashTable(0);
        } catch (IllegalArgumentException e1) {
            try {
                new HashTable(-42);
            } catch (IllegalArgumentException e2) {
                return;
            }
        }
        fail();
    }
}
