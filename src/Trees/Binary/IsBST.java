package Trees.Binary;


public class IsBST {


    /**
     * Computes whether the BinaryTree is a binary search tree.
     *
     * @param tree
     *     the BinaryTree to check.
     * @return true iff the BinaryTree is a binary search tree, else false.
     */
    public static boolean isTreeBST(BinaryTree tree) {
        return isBSTHelper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBSTHelper(BinaryTree tree, int min , int max) {
        //if is empty -> true
        if(tree == null) return true;

        //if doesn't satisfy property -> false
        if(tree.getKey() < min || tree.getKey() > max) return false;

        //recursively check children
        return isBSTHelper(tree.getLeft(), min, tree.getKey() - 1)
                && isBSTHelper(tree.getRight(), tree.getKey() + 1, max);

    }

}
