package Final;

public class CountNodes {
    /**
     * Counts the number of nodes in the tree at a certain level.
     *
     * @param tree
     *     The binary tree to count nodes in.
     * @param level
     *     The specified level to count nodes in.
     * @return the number of nodes at that level, or 0 if tree is null.
     */
    public static int countNodesAtLevel(BinaryTree tree, int level) {
        if(level < 0) return 0;
        if(tree == null) return 0;
        if(level == 0) return 1;
        return countNodesHelper(tree, level, 0);

    }

    public static int countNodesHelper(BinaryTree tree, int level, int curr) {
        if(tree == null) return 0;
        if(level == curr + 1) {
            int sum = 0;
            if(tree.hasLeft()) sum++;
            if(tree.hasRight()) sum++;
            return sum;
        }
        return countNodesHelper(tree.getLeft(), level, curr + 1) + countNodesHelper(tree.getRight(), level, curr + 1);
    }
}
