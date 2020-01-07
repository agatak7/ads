package Trees.Binary;

import org.hamcrest.core.Is;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class IsAVLTest {
    @Test
    public void testJustRoot() {
        BinaryTree tree = new BinaryTree(42);
        assertTrue(IsAVL.isTreeAVL(tree));
    }

    @Test
    public void testOneLevelTrue() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(21), new BinaryTree(84));
        assertTrue(IsAVL.isTreeAVL(tree));
    }

    @Test
    public void testOneLevelFalse() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(84), new BinaryTree(21));
        assertFalse(IsAVL.isTreeAVL(tree));
    }

    @Test
    public void testOneLevelFalseDuplicate() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(42), new BinaryTree(21));
        assertFalse(IsAVL.isTreeAVL(tree));
    }

    @Test
    public void testOneLeftChild() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(21), null);
        assertTrue(IsAVL.isTreeAVL(tree));
        tree = new BinaryTree(42, new BinaryTree(84), null);
        assertFalse(IsAVL.isTreeAVL(tree));
    }

    /*
           42
          /
         36
        /  \
       21  39
     */
    @Test
    public void testTwoLevelsSkew2() {
        BinaryTree tree = new BinaryTree(42, new BinaryTree(36, new BinaryTree(21), new BinaryTree(39)), null);
        assertFalse(IsAVL.isTreeAVL(tree));
    }
}
