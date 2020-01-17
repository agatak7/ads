package Final;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountNodesTest {
    @Test
    public void testSmall() {
        BinaryTree tree = new BinaryTree(0, new BinaryTree(1, new BinaryTree(3), new BinaryTree(4)), new BinaryTree(2, new BinaryTree(5), new BinaryTree(6)));
        assertEquals(1, CountNodes.countNodesAtLevel(tree, 0));
        assertEquals(2, CountNodes.countNodesAtLevel(tree, 1));
        assertEquals(4, CountNodes.countNodesAtLevel(tree, 2));
    }

    @Test
    public void testNull() {
        BinaryTree tree = null;
        assertEquals(0, CountNodes.countNodesAtLevel(tree, 0));
    }
}
