package Trees;


class ArithmeticTree {
    /**
     * Evaluates the arithmetic expression stored in this binary tree.
     *
     * @param node
     * @return
     * @throws IllegalArgumentException
     */
    @SuppressWarnings("rawtypes")
    public static int eval(Node node) throws IllegalArgumentException {

        //post-order traversal
        if(node instanceof LeafNode) {
            return (int) node.val;
        }else {
            InternalNode internalNode = (InternalNode) node;
            switch(internalNode.val) {
                case "+":
                    return eval(internalNode.left) + eval(internalNode.right);
                case "-":
                    return eval(internalNode.left) - eval(internalNode.right);
                case "*":
                    return eval(internalNode.left) * eval(internalNode.right);
                default:
                    throw new IllegalArgumentException();

            }
        }

    }
}
