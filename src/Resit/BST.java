package Resit;

public class BST {

    /**
     * Given a Binary Search Tree and an Integer, returns the Entry in this tree
     * with the smallest key that is strictly larger than k.
     *
     * @param tree
     *     Binary search tree to search in.
     * @param k
     *     The key of the resulting entry should be strictly larger than this k.
     * @return The entry with smallest key, strictly larger than k.
     */
    static Entry higherEntry(BinarySearchTree tree, int k) {

        if(tree == null) return null;
        BinarySearchTree current = tree;
        Entry result = null;

        while(current != null) {
            if(current.getKey() > k ) {
                result = current.getEntry();
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        return result;
    }

}
