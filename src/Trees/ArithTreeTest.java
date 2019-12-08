package Trees;

import static org.junit.Assert.*;

import org.junit.*;

public class ArithTreeTest {
    @Test
    @SuppressWarnings("rawtypes")
    public void testExample() {
        Node tree = new LeafNode(5);
        assertEquals(5, ArithmeticTree.eval(tree));
    }

    @Test
    @SuppressWarnings("rawtypes")
    public void testExample2() {
        Node tree = new InternalNode("+", new LeafNode(5), new LeafNode(10));
        assertEquals(15, ArithmeticTree.eval(tree));
    }

    @Test
    @SuppressWarnings("rawtypes")
    public void testComplex() {
        // (12 - ((3*13) + (39 * (6 + (14 - 2))))
        Node tree = new InternalNode("-", new LeafNode(12), new InternalNode("+", new InternalNode("*", new LeafNode(3), new LeafNode(13)), new InternalNode("*", new LeafNode(39), new InternalNode("+", new LeafNode(6), new InternalNode("-", new LeafNode(14), new LeafNode(2))))));
        assertEquals(-729, ArithmeticTree.eval(tree));
    }
}

