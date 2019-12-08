package Trees;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class TreeTest {
    @Test
    public void testEmptyTree() {
        assertListEquals(new int[]{}, TreeIterator.getAllNodesDF(null, Order.PRE));
        assertListEquals(new int[]{}, TreeIterator.getAllNodesDF(null, Order.IN));
        assertListEquals(new int[]{}, TreeIterator.getAllNodesDF(null, Order.POST));
    }

    @Test
    public void testJustRoot() {
        BinaryTree tree = new BinaryTree(1);
        assertListEquals(new int[]{1}, TreeIterator.getAllNodesDF(tree, Order.PRE));
        assertListEquals(new int[]{1}, TreeIterator.getAllNodesDF(tree, Order.IN));
        assertListEquals(new int[]{1}, TreeIterator.getAllNodesDF(tree, Order.POST));
    }

    @Test
    public void testTwoLevels() {
        BinaryTree tree = new BinaryTree(1, new BinaryTree(2), new BinaryTree(3));
        assertListEquals(new int[]{1, 2, 3}, TreeIterator.getAllNodesDF(tree, Order.PRE));
        assertListEquals(new int[]{2, 1, 3}, TreeIterator.getAllNodesDF(tree, Order.IN));
        assertListEquals(new int[]{2, 3, 1}, TreeIterator.getAllNodesDF(tree, Order.POST));
    }

    public static void assertListEquals(int[] expected, List<BinaryTree> nodes) {
        assertArrayEquals(expected, nodes.stream().mapToInt(BinaryTree::getKey).toArray());
    }
}
//