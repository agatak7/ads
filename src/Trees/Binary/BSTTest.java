package Trees.Binary;
import org.hamcrest.core.Is;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class BSTTest {
    @Test
    public void testOneLevelTrue() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(21), new BinaryTree(84));
        assertTrue(IsBST.isTreeBST(tree));
    }

    @Test
    public void testOneLevelFalse() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(84), new BinaryTree(21));
        assertFalse(IsBST.isTreeBST(tree));
    }

    @Test
    public void testOneLevelFalseDuplicate() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(42), new BinaryTree(21));
        assertFalse(IsBST.isTreeBST(tree));
    }

    @Test
    public void testOneLeftChild() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(21), null);
        assertTrue(IsBST.isTreeBST(tree));
        tree = new BinaryTree(42, new BinaryTree(84), null);
        assertFalse(IsBST.isTreeBST(tree));
    }
}
