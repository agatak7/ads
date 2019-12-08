package Trees;

abstract class Node<T> {
    public T val;
}

/**
 * Internal Node that stores an operator represented as a string
 */
@SuppressWarnings("rawtypes")
class InternalNode extends Node<String> {
    public Node left;
    public Node right;

    public InternalNode(String operator, Node left, Node right) {
        this.val = operator;
        this.left = left;
        this.right = right;
    }
}

/**
 * Leaf Node that stores an operand represented as an integer
 */
class LeafNode extends Node<Integer> {
    public LeafNode(int constant) {
        this.val = constant;
    }
}
