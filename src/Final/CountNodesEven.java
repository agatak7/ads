package Final;

public class CountNodesEven {
    /**
     * Counts the number of nodes with an event number of children.
     *
     * @param tree
     *     The tree to count nodes with an even number of children in.
     * @return the number of nodes with an even number of children, or 0 if tree is null.
     */
    public static int countNodesEvenChildren(LibraryTree tree) {
        if (tree == null) return 0;
        int sum = tree.getChildren().size();
        int result = 0;
        if(sum % 2 == 0) result = 1;
        for(LibraryTree child : tree.getChildren()) {
            result += countNodesEvenChildren(child);
        }
        return result;
    }
}
