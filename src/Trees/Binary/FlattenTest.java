package Trees.Binary;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FlattenTest {
    @Test
    public void testOneLevel() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(21), new BinaryTree(84));
        assertEquals(Arrays.asList(84, 42, 21), FlattenBST.descendingOrder(tree));
    }

    @Test
    public void testOneLeftChild() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(21), null);
        assertEquals(Arrays.asList(42, 21), FlattenBST.descendingOrder(tree));
    }
}
