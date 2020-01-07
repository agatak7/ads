package Trees.Binary;

public class IsAVL {
    /**
     * Computes whether the BinaryTree is an AVL tree.
     *
     * @param tree
     *     the BinaryTree to check.
     * @return true iff the BinaryTree is an AVL tree, else false.
     */
    public static boolean isTreeAVL(BinaryTree tree) {
        return isAVLHelper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isAVLHelper(BinaryTree tree, int min, int max) {
        if(tree==null) return true;

        if(tree.getKey()<min || tree.getKey()>max) return false;

        //Same as BST but also checks if max depth of children varies by more than 1
        int left = height(tree.getLeft());
        int right = height(tree.getRight());

        return (Math.abs(left - right) <= 1) && isAVLHelper(tree.getLeft(), min, tree.getKey()-1) && isAVLHelper(tree.getRight(), tree.getKey()+1, max);
    }

    public static int height(BinaryTree tree) {
        if (tree == null) return 0;
        return 1 + Math.max(height(tree.getLeft()), height(tree.getRight()));
    }
}
