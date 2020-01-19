package Resit;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

public class BstTest {
    @Test
    public void testBase() {
        BinarySearchTree tree = new BinarySearchTree(1, 42);
        assertEquals(1, BST.higherEntry(tree, 0).key);
        assertNull(BST.higherEntry(tree, 1));
        assertNull(BST.higherEntry(tree, 2));
        assertNull(BST.higherEntry(null, 42));
    }

    @Test
    public void testSmall() {
        BinarySearchTree tree = new BinarySearchTree(42, 42, new BinarySearchTree(21, 21, new BinarySearchTree(10, 10), new BinarySearchTree(30, 30)), new BinarySearchTree(84, 84, new BinarySearchTree(60, 60), new BinarySearchTree(100, 100)));
        assertEquals(10, BST.higherEntry(tree, 2).key);
        assertEquals(60, BST.higherEntry(tree, 42).key);
        assertEquals(100, BST.higherEntry(tree, 88).key);
    }
}
