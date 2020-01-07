package Trees.Binary;

import java.util.ArrayList;
import java.util.List;

public class FlattenBST {

    /**
     * Return all elements in the given BST in descending order.
     * @param tree The BST to traverse.
     * @return A list of all elements in reverse order.
     */
    public static List<Integer> descendingOrder(BinaryTree tree) {
        List<Integer> result = new ArrayList<>();
        //Traverse the tree
        if(tree == null) return new ArrayList<Integer>();

        result.addAll(descendingOrder(tree.getRight()));
        result.add(tree.getKey());
        result.addAll(descendingOrder(tree.getLeft()));

        return result;
    }
}
