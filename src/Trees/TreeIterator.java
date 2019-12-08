package Trees;

import java.util.*;

class TreeIterator {
    /**
     * @param tree
     *     The input BinaryTree.
     * @param order
     *     The order in which the binary tree nodes need to be returned: pre-order, in-order, or post-order.
     * @return A list of all nodes of the tree, in the specified order.
     */
    public static List<BinaryTree> getAllNodesDF(BinaryTree tree, Order order) {
        ArrayList<BinaryTree> result = new ArrayList<>();
        if(tree == null) {return result;}
        if(order == Order.POST) {

            // first recur on left subtree
            result.addAll(getAllNodesDF(tree.getLeft(), order));

            // then recur on right subtree
            result.addAll(getAllNodesDF(tree.getRight(), order));

            result.add(tree);

        }else if(order == Order.IN) {
            // first recur on left subtree
            result.addAll(getAllNodesDF(tree.getLeft(), order));

            result.add(tree);

            // then recur on right subtree
            result.addAll(getAllNodesDF(tree.getRight(), order));


        }else  if(order == Order.PRE) {
            result.add(tree);
            // first recur on left subtree
            result.addAll(getAllNodesDF(tree.getLeft(), order));

            // then recur on right subtree
            result.addAll(getAllNodesDF(tree.getRight(), order));

        }


        return result;
    }
}
//

